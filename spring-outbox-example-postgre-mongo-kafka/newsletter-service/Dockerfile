FROM openjdk:15-jre-slim-buster
VOLUME /main-app
ADD target/*.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]