FROM openjdk:21.0.2
EXPOSE 8080:8080
RUN mkdir /app
COPY ./build/libs/*-all.jar /app/elevaktor-server.jar
ENTRYPOINT ["java","-jar","/app/elevaktor-server.jar"]