FROM java:8-jre
MAINTAINER Eugene Karanda <eugene.karanda@gmail.com>

ADD ./build/libs/spring-boot-docker-0.0.1-SNAPSHOT.jar /app/
CMD java -agentlib:jdwp=transport=dt_socket,address=18080,suspend=n,server=y -jar /app/spring-boot-docker-0.0.1-SNAPSHOT.jar

EXPOSE 8080
EXPOSE 18080