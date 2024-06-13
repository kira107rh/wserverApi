# Usar una imagen base de Java
FROM openjdk:1-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR de la aplicación
COPY build/libs/ServerKtor3.jar /app/ServerKtor3.jar

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "/app/ServerKtor3.jar"]
