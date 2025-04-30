FROM openjdk:17

COPY target/uber-app.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "uber-app.jar"]
