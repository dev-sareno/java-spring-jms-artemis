# Spring 5 & JMS Training | Part 2

## The project
1. The project is created using Spring Initializr [https://start.spring.io/](https://start.spring.io/).
1. Uses Gradle instead of Maven.
1. Uses `Spring Boot`.
1. Uses JAVA 1.8.

## Things to Note
1. The JMS server was taken down and is excluded on this project.
1. Mocking tests is applied to ApiService in ApiControllerServiceMockTests.java instead of JmsTemplate.
1. Log file is located in `<projectRoot>/spring.log` or change the log file path in `application.properties`.
1. As corollary to #1, the **JMS Swagger-like** is not added on this project.

## What's on this project?
1. Uses Gradle instead of Maven.
1. More test cases.
1. Mocking test.
1. Logs are saved into file.
1. API Documentation with Swagger. Link [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html).
1. Uses Aspect-Oriented Programming, refer to `ControllerAspect.java`.
