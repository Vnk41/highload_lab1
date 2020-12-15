FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/highload_lab1_8-0.0.1-SNAPSHOT.jar
COPY target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
