FROM openjdk:11
COPY target/spring-boot-db-app /usr/app
WORKDIR /usr/app
ENTRYPOINT [ "java","-jar","spring-boot-db-app-1.1.jar" ]
