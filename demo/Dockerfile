# === BUILD STAGE ===
# Use a specific Maven 4.0.0 release candidate image with a JRE (e.g., Temurin 21 on Alpine)
FROM maven:4.0.0-rc-5-eclipse-temurin-21-alpine AS build

# Set the working directory inside the container for the build stage
WORKDIR /app

# Copy the pom.xml file first to allow Docker to cache dependency downloads
COPY pom.xml .

# Download dependencies in an isolated step (using buildkit cache mount for performance if available)
# Use `-B` for non-interactive (batch) mode
RUN mvn dependency:go-offline -B

# Copy the rest of the source code
COPY src ./src

# Compile and package the application, skipping tests for image build
RUN mvn clean package -Dmaven.test.skip=true

# === PACKAGE/RUN STAGE ===
# Start a new, minimal stage for the final runtime image using only JRE
FROM eclipse-temurin:21-jre-alpine

# Set the working directory for the runtime
WORKDIR /app

# Copy the built JAR file from the 'build' stage's target directory to the run directory
COPY --from=build /app/target/*.jar app.jar

# Expose the port your application runs on (default for many Spring Boot apps is 8080)
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
