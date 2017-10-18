rm -rf /Users/gauravshukla/Downloads/apache-tomcat-7.0.79/webapps/springwebapp*.*
rm -rf /Users/gauravshukla/Downloads/apache-tomcat-7.0.79/webapps/springwebapp
rm /Users/gauravshukla/Downloads/apache-tomcat-7.0.79/logs/catalina.out
/Users/gauravshukla/Downloads/apache-tomcat-7.0.79/bin/catalina.sh stop
/Users/gauravshukla/Downloads/apache-tomcat-7.0.79/bin/catalina.sh start
tail -f /Users/gauravshukla/Downloads/apache-tomcat-7.0.79/logs/catalina.out
