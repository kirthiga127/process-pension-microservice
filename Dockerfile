FROM adoptopenjdk/openjdk15:alpine-jre
VOLUME /tmp
EXPOSE 8100
ADD target/*.jar processpension-microservice.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /processpension-microservice.jar" ]

#FROM adoptopenjdk/openjdk15:alpine-jre
#EXPOSE 8100
#ADD target/processpension-microservice.jar processpension-microservice.jar
#ENTRYPOINT ["java","-jar","/processpension-microservice.jar"]
