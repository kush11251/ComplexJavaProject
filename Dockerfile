FROM maven:3.9-eclipse-temurin-17
COPY src /app/src
COPY pom.xml /app
WORKDIR /app
RUN mvn clean package
CMD ["java", "-jar", "target/app-1.0-SNAPSHOT.jar"]