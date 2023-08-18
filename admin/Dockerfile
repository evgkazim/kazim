FROM openjdk:latest
EXPOSE 8090
RUN mkdir /app
COPY /target/admin-0.1.jar /app/admin-0.1.jar
ENTRYPOINT env && exec java -jar /app/admin-0.1.jar