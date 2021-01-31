FROM openjdk:8-jdk-alpine
ADD target/centralServer-docker.jar centralServer-docker.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","centralServer-docker.jar"]
