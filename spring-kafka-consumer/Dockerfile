# ----------- BUILD STAGE -----------
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app
# Copy pom.xml first (for dependency caching)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source code
COPY src ./src

# Build the JAR
RUN mvn clean package -DskipTests


# ----------- RUNTIME STAGE -----------
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/*.jar consumer.jar
ENTRYPOINT [ "java","-jar","consumer.jar" ]