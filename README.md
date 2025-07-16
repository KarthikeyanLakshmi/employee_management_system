# A Spring Boot program to capture employee details from Angular UI and store them in MySQL project.

## ✅ 1. Check Prerequisites
Ensure the following are installed:

MySQL (with a schema created, e.g., employee_db)

Java JDK 17+

Node.js & npm

Angular CLI (ng)

Spring Boot project built with Maven or Gradle

VS Code or any IDE (like IntelliJ, STS)

## 🛠️ 2. MySQL Setup
- 2a. Start MySQL server
    Make sure MySQL is running.

- 2b. Create database
```sql
CREATE DATABASE employee_db;
```

- 2c. Optional: Create a user (if not using root)
```sql
CREATE USER 
'springuser'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON employee_db.* TO 'springuser'@'localhost';
```

## 🧩 3. Spring Boot Backend
- 3a. application.properties or application.yml
    Ensure your DB settings are configured correctly:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#Allow CORS if Angular runs on a different port
spring.mvc.cors.allowed-origins=http://localhost:4200
```

- 3b. Build and run Spring Boot app
    From the root of the backend project:

```bash
./mvnw spring-boot:run      # if using Maven wrapper
or
mvn spring-boot:run         # if Maven is globally installed
```
If using Gradle:

```bash
./gradlew bootRun
```
You should see something like:

```scss
Tomcat started on port(s): 8080
Started Application in X seconds
```
## 🎨 4. Angular Frontend
- 4a. Navigate to frontend folder
```bash
cd path/to/angular-app
```

- 4b. Install dependencies (only needed once)
```bash
npm install
```

- 4c. Start Angular dev server
```bash
ng serve
```
By default, it runs at:
➡️ http://localhost:4200

## 🔁 5. Integration Notes
Ensure:
Angular app makes API calls to http://localhost:8080/api/employees or your actual Spring Boot endpoint.

Spring Boot allows CORS (Cross-Origin Resource Sharing). You can do it globally or per controller using:

```java
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    ...
}
```
## ✅ 6. Test the Full Flow
Go to http://localhost:4200

Fill and submit the employee form

Check the data is sent to Spring Boot and inserted into MySQL:

```sql
SELECT * FROM employee;
```

## 🧪 Optional: Use Postman to test backend
Test the API directly via Postman:

GET http://localhost:8080/api/employees

POST http://localhost:8080/api/employees with JSON body
