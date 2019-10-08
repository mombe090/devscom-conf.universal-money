FROM takitake/gradle-alpine

WORKDIR /app

COPY build.gradle .

RUN gradle clean buildlllll

COPY . .

RUN gradle fatJar

EXPOSE 7000
CMD ["java", "-jar", "build/libs/user-service-all-1.0-SNAPSHOT.jar"]
