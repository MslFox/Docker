FROM adoptopenjdk/openjdk11

EXPOSE 8080

ADD target/simpleServerForDocker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
