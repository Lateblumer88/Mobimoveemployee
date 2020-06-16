FROM openjdk:8
EXPOSE 8080
MAINTAINER  Sebastien mimi (mimi@mokaza.com) 
ADD target/mobimoveEmployee.jar mobimoveEmployee.jar
ENTRYPOINT ["java","-jar","/mobimoveEmployee.jar"]
USER mobi
