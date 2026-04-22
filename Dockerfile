FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Debug (to check jar exists)
RUN ls target

EXPOSE 8080

CMD ["sh", "-c", "java -jar target/*.jar"]