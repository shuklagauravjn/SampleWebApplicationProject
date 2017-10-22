package com.jeromejaglale.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeromejaglale.domain.Car;
import com.jeromejaglale.service.CarService;

@Controller
public class CarController {
	@Autowired
	private CarService carService;
	
	@RequestMapping("/car/list")
	public void carList(Model model) {
		List<Car> carList = carService.findAll();
		model.addAttribute("carList", carList);
	}
	
	@RequestMapping("/car/add")
	public void carAdd() {
	}
	
	@RequestMapping(value="/car/add", method=RequestMethod.POST)
	public String carAddSubmit(@ModelAttribute("car") @Valid Car car, BindingResult result) {
		if(result.hasErrors()) {
			// show the form again, with the errors
			return "car/add";
		}
	
		// validation was successful
		carService.add(car);
		return "redirect:/car/list";
			
	}

	@RequestMapping(value = "/getImage", method = RequestMethod.GET)
	  public void showImage(HttpServletRequest request,HttpServletResponse response) throws Exception {

	    ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
	    String carName = request.getParameter("carName");
	    try {
            String path = "/Users/gauravshukla/git/SampleWebApplicationProject/src/main/webapp/WEB-INF/jsp/car/"+carName+".jpg";
            InputStream is = new FileInputStream(path);
            BufferedImage img = ImageIO.read(is);
	      ImageIO.write(img, "jpeg", jpegOutputStream);
	    } catch (IllegalArgumentException e) {
	      response.sendError(HttpServletResponse.SC_NOT_FOUND);
	    }

	    byte[] imgByte = jpegOutputStream.toByteArray();

	    response.setHeader("Cache-Control", "no-store");
	    response.setHeader("Pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
	    response.setContentType("image/jpeg");
	    ServletOutputStream responseOutputStream = response.getOutputStream();
	    responseOutputStream.write(imgByte);
	    responseOutputStream.flush();
	    responseOutputStream.close();
	  }

	}