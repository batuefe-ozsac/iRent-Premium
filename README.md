# iRent Premium API 🚗✨

**Author:** Batu Efe Özsaç (Student ID: 2023510205)  
**Institution:** Dokuz Eylül University  

iRent Premium is an enterprise-grade RESTful API built for modern car rental systems. Moving beyond basic CRUD operations, this project is engineered with a strict focus on **Clean Architecture**, **SOLID Principles**, and **GoF Design Patterns** to ensure high cohesion, low coupling, and maximum scalability.

---

## 🏗️ Software Architecture & Design Patterns

This project serves as a showcase of advanced Object-Oriented Programming (OOP) concepts applied in a Spring Boot environment.

### 1. N-Tier (Layered) Architecture
The system is strictly divided into functional layers to separate concerns:
* **Controller Layer (`UI` / `Web`):** Handles incoming HTTP REST requests.
* **Service Layer (`Business Logic`):** Orchestrates the rules (e.g., checking availability, calculating prices).
* **Repository Layer (`Data Access`):** Manages data persistence.
* **Model Layer (`Domain`):** Contains the core entities (`Car`, `Customer`, `Rent`).

### 2. Design Patterns Implemented
* **Factory Pattern (Creational):** The `CarFactory` centralizes the instantiation of various car types (`SedanCar`, `LuxuryCar`). The service layer never uses the `new` keyword for vehicles, adhering to the Open/Closed Principle when new vehicle types are added.
* **Strategy Pattern (Behavioral):** Pricing algorithms are encapsulated into interchangeable strategies (`StandartPricing`, `VipPricing`). This eliminates complex `if-else` pricing structures within the `RentalService`.
* **Decorator Pattern (Structural):** Dynamic features (e.g., `ChildSeatDecorator`) can wrap existing `Car` objects at runtime to modify their daily prices and descriptions without altering the base classes.

### 3. SOLID Principles Highlight
* **Dependency Inversion Principle (DIP):** The `RentalService` does not depend on concrete database classes. Instead, it depends on the `ICarRepository` interface. The underlying `InMemoryDatabase` can be seamlessly swapped out for a PostgreSQL/MySQL implementation without modifying a single line of business logic.

### 4. Custom Exception Handling
* Business rule violations (e.g., attempting to rent an already rented vehicle) trigger custom exceptions (`VehicleAlreadyRentedException`), which are gracefully caught and handled, preventing system crashes.

---

## 🚀 Tech Stack

* **Language:** Java 23
* **Framework:** Spring Boot 3.x (Spring Web)
* **Build Tool:** Maven
* **Data Format:** JSON

---

## ⚙️ How to Run

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE (Eclipse, IntelliJ IDEA, or VS Code).
3. Run the `PremiumApiApplication.java` file as a Java/Spring Boot Application.
4. The embedded Tomcat server will start on port `8080` (or `8081` depending on properties).
5. Open your browser or Postman and navigate to:
   ```text
   http://localhost:8080/api/cars