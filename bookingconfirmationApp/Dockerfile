# Use an official OpenJDK as a parent image
FROM openjdk:17-jdk-slim
# Set the working directory in the container
WORKDIR /bookingconfirmation
# Copy the JAR file into the container
COPY target/*.jar bookingconfirmation.jar
# Expose the port your Spring Boot app runs on
EXPOSE 8080
# Run the JAR file
ENTRYPOINT ["java", "-jar", "bookingconfirmation.jar"]