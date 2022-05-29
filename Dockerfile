FROM openjdk:8

EXPOSE 8100

ADD target/ProcessPension-Microservice.jar ProcessPension-Microservice.jar

ENTRYPOINT ["java","-jar","/ProcessPension-Microservice.jar"]
