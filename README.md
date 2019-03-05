Spring Boot
Experimentation of Spring Boot for Java

Configuration by using application.properties
http://localhost:12378/demo/api/v1/hello
http://localhost:12378/demo/api/v1/publish/helloWorld

Swagger
http://localhost:12378/demo/swagger-ui.html
- see https://dzone.com/articles/spring-boot-2-restful-api-documentation-with-swagg
- see https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api

ApacheMQ
- https://youtu.be/zaCXYkzLgJc
- https://github.com/TechPrimers/inmemory-spring-boot-activemq-example
- https://youtu.be/w78qhfpnLA0
- https://github.com/TechPrimers/standalone-spring-boot-activemq-example
https://youtu.be/w78qhfpnLA0

Standalone ActiveMQ (profile -> prod)
Open cmd
In directory ...\apache-activemq-5.15.8\bin
Start Active MQ by entering: activemq start
http://127.0.0.1:8161/admin/
http://127.0.0.1:8161/admin/connections.jsp
Start Spring Boot application
Hit http://localhost:12378/demo/api/v1/publish/helloWorld
If Consumer (MessageListener) exists, mesage is dequeued
