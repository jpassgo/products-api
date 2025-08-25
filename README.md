## Getting Started

This is a spring boot project using kotlin dsl for gradle. 

In order to build and start the API run `./gradlew clean build bootRun`.

You will also need to set the postgres database the API will connect to here:
```declarative
spring:
  application:
    name: products-api
  datasource:
    url: jdbc:postgresql://localhost:5433/products
    username: jeffpascoe
    password:
    driver-class-name: org.postgresql.Driver
```
