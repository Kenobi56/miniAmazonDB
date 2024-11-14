# AmazonClone
Making a mini-Amazon-like to practice with a micro service architecture. This component is the micro service managing the database.

#Setup
```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```
#Tools

- H2 database created and filled with data at start [http://localhost:8080/h2-console](http://localhost:8080/h2-console/)
- Swagger generated at start -> [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)