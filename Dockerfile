FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/component-config-server-0.0.1-SNAPSHOT.jar component-config-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/component-config-server-0.0.1-SNAPSHOT.jar"]