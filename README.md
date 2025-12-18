**📘 Student Management System (Java + MySQL)**
🔹 Project Description
The Student Management System is a console-based Java application that allows administrators to manage student records efficiently.
It performs CRUD operations (Create, Read, Update, Delete) using Java JDBC and MySQL database.

This project is designed for freshers to understand real-time database connectivity and backend logic.

🛠️ Technologies Used
Java (JDK 17 / 21)
JDBC
MySQL
MySQL Workbench
IntelliJ IDEA

📌 Features
Add new student
View all students
Update student course
Delete student record
Menu-driven console interface

🗄️ Database Design

Database Name: student_db

CREATE TABLE student (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15),
    course VARCHAR(50)
);

📂 Project Structure
com.student
 ├── dao        → Database operations
 ├── model      → Entity classes
 ├── util       → Database connection
 └── main       → Application entry point

🔌 JDBC Connection
jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC

▶️ How to Run the Project

Clone the repository
git clone https://github.com/Saleemkmg10/StudentManagementSystem.git


Open in IntelliJ IDEA
Add MySQL Connector JAR to project libraries

Update database credentials in DBConnection.java
username = root
password = your_mysql_password


Run MainApp.java

🧠 Key Concepts Learned
JDBC Connectivity
SQL CRUD operations
DAO Design Pattern
Exception Handling
Console-based menu systems

🚀 Future Enhancements
GUI using Java Swing
Spring Boot REST API
Web interface using HTML/CSS
User authentication

👤 Author
Saleem
Java Developer 
saleemkmg.dev@gmail.com

