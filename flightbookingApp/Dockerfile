# Use an official OpenJDK as a parent image
FROM openjdk:17-jdk-slim
# Set the working directory in the container
WORKDIR /flightbookingApp
# Copy the JAR file into the container
COPY target/*.jar flightbookingApp.jar
# Expose the port your Spring Boot app runs on
EXPOSE 8085
# Run the JAR file
ENTRYPOINT ["java", "-jar", "flightbookingApp.jar"]