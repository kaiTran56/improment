FROM openjdk
COPY target/spring-cloud.jar spring-cloud.jar
ENTRYPOINT ["java", "-jar", "/spring-cloud.jar"]