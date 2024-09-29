FROM openjdk:17
COPY target/Docker-Demo.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]