FROM openjdk:8-alpine
#RUN mvn clean package -DskipTests
ADD target/docker2-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]