FROM openjdk:8
EXPOSE 8080
ADD target/demoproject-0.0.1-SNAPSHOT.jar demoproject-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demoproject-0.0.1-SNAPSHOT.jar"]