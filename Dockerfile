# Etapa 1: build del JAR
FROM gradle:8.5.0-jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle clean bootJar --no-daemon

# Etapa 2: imagen final optimizada
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar xarvis.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "xarvis.jar"]