FROM openjdk:8
EXPOSE 8080
ADD build/libs/kubernetes-demo-0.0.1-SNAPSHOT.jar kubernetes-demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "kubernetes-demo-0.0.1-SNAPSHOT.jar"]