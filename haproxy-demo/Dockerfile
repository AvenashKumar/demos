FROM amd64/openjdk:16-jdk-slim-buster

WORKDIR /apps/haproxy-demo
COPY ./target/haproxy-demo-0.0.1-SNAPSHOT.jar /apps/haproxy-demo/haproxy-demo.jar
RUN ln -snf /usr/share/zoneinfo/America/New_York /etc/localtime && echo "America/New_York" > /etc/timezone
ENTRYPOINT ["java", "-jar", "haproxy-demo.jar"]
EXPOSE 80