FROM adoptopenjdk/openjdk11:alpine AS builder

VOLUME /vol

ARG jar_file=build/libs/*.jar
COPY ${jar_file} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]