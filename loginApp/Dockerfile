# Use an official OpenJDK as a parent image
FROM openjdk:17-jdk-slim
# Set the working directory in the container
WORKDIR /loginapp
# Copy the JAR file into the container
COPY target/*.jar loginapp.jar
# Expose the port your Spring Boot app runs on
EXPOSE 8087
# Run the JAR file
ENTRYPOINT ["java", "-jar", "loginapp.jar"]