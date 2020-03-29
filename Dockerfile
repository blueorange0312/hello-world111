FROM adoptopenjdk/openjdk13:ubi
RUN mkdir /opt/app
COPY target/rong-test-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/rong-test-0.0.1-SNAPSHOT.jar"]
