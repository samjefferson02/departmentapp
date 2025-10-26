FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/departmentapp-0.0.1-SNAPSHOT.jar departmentapp.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "departmentapp.jar"]
