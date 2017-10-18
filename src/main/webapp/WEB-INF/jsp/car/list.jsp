<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<body>
	<table>
	<tr><h1>Cars</h1></tr>
	<c:forEach items="${carList}" var="car">
	<tr><th><img src="/springwebapp/getImage?carName=${car.name}" alt="car"/></th><th><p>${car.name}</p></th><th><p>$${car.price}</p></<th></tr>
	</c:forEach>
	</table>

</body>
</html>