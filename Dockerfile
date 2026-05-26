FROM eclipse-temurin:17

WORKDIR /app

COPY target/*.jar focusflow.jar

EXPOSE 8085

ENTRYPOINT ["java","-jar","focusflow.jar"]