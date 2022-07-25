FROM openjdk:8-alpine
#RUN mvn clean package -DskipTests
ADD target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
