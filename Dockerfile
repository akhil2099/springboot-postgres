# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project file and source code
COPY pom.xml .
COPY src ./src

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the application
RUN mvn clean package -DskipTests

# Expose the port the app runs on
EXPOSE 8083

# Run the jar file
ENTRYPOINT ["java","-jar","/app/target/spring-0.0.1-SNAPSHOT.jar"] 