FROM openjdk:17-jdk-slim
MAINTAINER "maheshgowdag29@gmail.com"
WORKDIR /app
COPY ./target/*.jar app.jar

EXPOSE 9000
ENTRYPOINT [ "java","-jar","app.jar" ]
