FROM openjdk:11-jdk

ADD bankend-*.jar /appdata/back-end.jar

WORKDIR /appdata

ENTRYPOINT java -Dspring.profiles.active=prd -jar back-end.jar