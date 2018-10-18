FROM openjdk:8-jre
MAINTAINER Markus Schlichting <markus.schlichting@karakun.com>

ENV RATPACK_PORT 80

COPY build/libs/demo-0.1.0-SNAPSHOT-all.jar /opt/demo.jar

EXPOSE 80
CMD ["java", "-jar", "/opt/demo.jar"]
