FROM zenika/alpine-maven

WORKDIR /app

COPY pom.xml .

RUN mvn install

COPY . .

RUN mvn clean compile assembly:single

EXPOSE 4567
CMD ["java", "-jar", "target/external-data-jar-with-dependencies.jar"]

