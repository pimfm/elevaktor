FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080:8080
RUN mkdir /app
COPY ./build/libs/*-all.jar /app/elevaktor-server.jar
ENTRYPOINT ["java","-jar","/app/elevaktor-server.jar"]