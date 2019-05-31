FROM java:8
VOLUME /tmp
ADD target/*.jar app.jar
EXPOSE 9090
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-jar", "/app.jar"]