FROM gradle:8.4 AS BUILD
WORKDIR /usr/app/
COPY . .
RUN gradle build

FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080:8080
RUN mkdir /app
COPY --from=BUILD /usr/app/build/libs/*-all.jar /app/elevaktor-server.jar
ENTRYPOINT ["java","-jar","/app/elevaktor-server.jar"]