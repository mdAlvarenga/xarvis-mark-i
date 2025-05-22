# Dockerfile - Xarvis Mark I 
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copiamos solo lo necesario
COPY xarvis.jar .

# Exponemos el puerto por defecto
EXPOSE 8080

# Comando para ejecutar la app
CMD ["java", "-jar", "xarvis.jar"]