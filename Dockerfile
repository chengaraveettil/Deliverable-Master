FROM openjdk:8-jdk-alpine
ADD target/deliverable-service.jar deliverable-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "deliverable-service.jar"]
