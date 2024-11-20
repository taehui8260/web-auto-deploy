FROM openjdk:11-jdk

RUN mkdir -p /data/K-SIGHT/files
RUN mkdir -p /DATA/data-portal/logs
RUN mkdir -p /DATA/data-portal/app

ADD ksight-external-*.jar /DATA/data-portal/app/ksight-external.jar

WORKDIR /DATA/data-portal/app

ENTRYPOINT java -Dspring.profiles.active=prd -Dspring.application.name=${SPRING_APPLICATION_NAME} -jar ksight-external.jar