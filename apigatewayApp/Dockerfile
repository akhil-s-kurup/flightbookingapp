# Use an official OpenJDK as a parent image
FROM openjdk:17-jdk-slim
# Set the working directory in the container
WORKDIR /apigateway
# Copy the JAR file into the container
COPY target/*.jar apigateway.jar
# Expose the port your Spring Boot app runs on
EXPOSE 8083
# Run the JAR file
ENTRYPOINT ["java", "-jar", "apigateway.jar"]