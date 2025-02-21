![GitHub language count](https://img.shields.io/github/languages/count/souzafcharles/Microservices-Java-Spring)
![GitHub top language](https://img.shields.io/github/languages/top/souzafcharles/Microservices-Java-Spring)
![GitHub](https://img.shields.io/github/license/souzafcharles/Microservices-Java-Spring)
![GitHub last commit](https://img.shields.io/github/last-commit/souzafcharles/Microservices-Java-Spring)


# Practical Implementation of Microservices with Java Spring and RabbitMQ

▶️ Project developed based on tutorials by **Michelli Brito** - [Decoder](https://www.michellibrito.com/).
***
## Overview  
Microservices architecture is a widely adopted approach in modern software development, enabling scalable and maintainable applications. This tutorial examines the implementation of two microservices:  

- [User Microservice](https://github.com/souzafcharles/Microservices-Java-Spring/tree/main/user)  
- [Email Microservice](https://github.com/souzafcharles/Microservices-Java-Spring/tree/main/email)   

The system employs **RabbitMQ messaging** for asynchronous communication between services, ensuring efficient data exchange and decoupled processing. Additionally, the project incorporates:  

- **Email delivery via Gmail SMTP;**  
- **Key microservice development concepts**, including:  
  - Service isolation;  
  - Messaging patterns;  
  - Integration techniques.  

This resource provides a practical guide for developers who want to:  
- Learn about and implement **microservices architecture** using Spring Boot;
- Use **RabbitMQ** for asynchronous, message-driven communication; and
- Integrate **email capabilities** effectively within their microservices.
  
---

## Project Stack:  

| Technology        | Version   | Description                                           |
|-------------------|-----------|-------------------------------------------------------|
| 📐 IntelliJ IDEA  | `2024.3`  | Integrated Development Environment (IDE)              |
| ☕ Java           | `21`      | Backend programming language                          |
| 🌱 Spring Boot    | `3.4.2`   | Framework for creating Spring applications            |
| 🐦 Maven          | `3.9.9`   | Build automation and dependency management tool       |
| 🐘 PostgreSQL     | `17`      | Relational database management system                 |
| 🏭 RabbitMQ       | `3.13.1`  | Open-source message broker for asynchronous messaging |
| 🐇  CloudAMQP     | `N/A`     | Managed RabbitMQ service in the cloud                 |

---

## Dependencies:  

| Dependency              | Category         | Description                                                                                                    |
|-------------------------|------------------|----------------------------------------------------------------------------------------------------------------|
| 🌐 Spring Web           | Web              | Build web applications, including RESTful APIs, using Spring MVC. Uses Apache Tomcat as the default container  |
| 💾 Spring Data JPA      | SQL              | Facilitates database access using JPA with Spring Data and Hibernate                                           |
| 🐘 PostgreSQL Driver    | SQL              | JDBC and R2DBC driver enabling Java applications to interact with PostgreSQL databases                         |
| 🏭 Spring for RabbitMQ  | Messaging        | Provides integration with RabbitMQ for message-driven microservices                                            |
| ✔️ Validation           | Validation (I/O) | Enables Java Bean Validation using Hibernate Validator                                                         |
| 📧 Java Mail Sender     | Messaging (I/O)  | Enables sending emails from Java applications using the JavaMail API                                           |
| 🗝️ dotenv-java          | Configuration    | Loads environment variables from a `.env` file into the application, aiding in secure configuration management |

---

## Checklist:  
- [X] Creating the *User* and *Email* Microservices with Spring Boot;  
- [ ] Implementing the *Save Users* Endpoint;  
- [ ] Establishing a Connection with RabbitMQ on CloudAMQP and Configurations;  
- [ ] Developing the Consumer;  
- [ ] Developing the Producer;  
- [ ] Executing the Asynchronous Communication Flow Between Microservices;  
- [ ] Implementing Email Sending via Gmail SMTP;  
- [ ] Running the Complete Workflow;  
