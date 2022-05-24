FROM openjdk:15
EXPOSE 8100
ADD target/processpension-microservice.jar processpension-microservice.jar
ENTRYPOINT ["java","-jar","/processpension-microservice.jar"]