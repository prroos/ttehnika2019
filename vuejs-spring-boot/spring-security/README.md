# Example Spring Security project for Vue.js and Spring Boot

This project is meant to implement a custom login form in Vue.js that is authenticated in Spring. Logout is not implemented.

Documentation for frameworks be found from:
- https://vuejs.org/v2/guide/
- https://spring.io/guides/gs/spring-boot/

Project was created with vue-cli (https://cli.vuejs.org/) and
spring boot initializr (https://start.spring.io/).

## How to start
Build frontend environment
```
cd web
npm install
npm run serve
```

Run Spring Boot (which will also install all dependencies)
```
(from the root of example project)
./gradlew bootRun
```

Go to `http://localhost:8081` in browser