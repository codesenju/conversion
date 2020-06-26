FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/conversion-0.1.0.jar
WORKDIR /app/local
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]