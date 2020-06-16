FROM openjdk:8-jdk-alpine
COPY target/*.jar /deployments/xyz-seed-svc.jar
RUN chmod 777 /var/log
ENTRYPOINT ["java","-jar","/deployments/xyz-seed-svc.jar"]