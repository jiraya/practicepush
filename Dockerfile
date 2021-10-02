FROM openjdk:8

ADD target/kalyanimaske-springboot-docker.jar kalyanimaske-springboot-docker.jar

EXPOSE 8080 

ENTRYPOINT ["java","-jar","/kalyanimaske-springboot-docker.jar"]