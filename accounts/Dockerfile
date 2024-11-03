# Start with a base image containing Java runtime
FROM openjdk:21-slim

WORKDIR /app

# Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "accounts.jar"]
