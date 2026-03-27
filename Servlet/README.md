# FirstServlet Project

## 📌 Overview
This project demonstrates basic Java Web Development using **Servlets, JSP, and Apache Tomcat**.  
It includes handling HTTP requests, form submission, and dynamic response generation.

---

## 🚀 Features
- Create and run a basic Servlet
- Handle GET and POST requests
- Form submission using HTML
- Forward request using RequestDispatcher
- Display dynamic data using JSP

---

## 🛠️ Tech Stack
- Java
- Servlets (Jakarta/Javax)
- JSP
- Apache Tomcat
- Maven

---

## 📂 Project Structure
```
src/
 └── main/
     ├── java/
     │    ├── FirstServlet.java
     │    ├── SecondServlet.java
     │    └── ThirdServlet.java
     └── webapp/
          ├── WEB-INF/
          ├── form.html
          ├── index.jsp
          └── result.jsp

target/
 └── Servlet.war
```

---

## ⚙️ Setup Instructions
1. Clone the repository
2. Build project using Maven:
   ```
   mvn clean package
   ```
3. Copy the generated `.war` file to:
   ```
   C:\ProgramData\Tomcat9\webapps
   ```
4. Start Tomcat server
5. Open browser:
   ```
   http://localhost:8080/Servlet
   ```

---

## 📸 Endpoints
- `/Servlet/first` → First Servlet
- `/Servlet/form.html` → Form input
- `/Servlet/third` → Process form & show result

---

## 🧠 Learning Outcomes
- Understanding Servlet lifecycle
- Handling HTTP requests/responses
- Using JSP for dynamic content
- Deploying WAR files in Tomcat

---

## 👨‍💻 Author
Barnam Das