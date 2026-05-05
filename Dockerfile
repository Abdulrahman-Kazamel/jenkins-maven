#FROM eclipse-temurin:21-jdk
#FROM alpine/java:22-jdk
FROM eclipse-temurin:22-jdk-alpine
COPY ./target/demo1-0.0.1-SNAPSHOT.jar demo1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo1-0.0.1-SNAPSHOT.jar"]
