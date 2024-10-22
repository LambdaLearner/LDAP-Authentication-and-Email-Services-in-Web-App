# LDAP Authentication and Email Services in Web Application

## Overview

This project implements LDAP authentication and email services within a web application, leveraging **Spring Boot**, **Spring Security**, **Thymeleaf**, and **JavaMail**. It provides user authentication using LDAP, as well as student management features with create, update, delete, and view functionalities. The application includes email notifications and integrates a responsive user interface.

## Features

- **LDAP Authentication**: Secure login via LDAP server.
- **Email Services**: Automated email notifications for various user actions.
- **Student Management**: CRUD operations for managing student entities.
- **Exception Handling**: Graceful error handling for web requests.
- **Responsive UI**: Frontend built using Thymeleaf templates, integrated with FontAwesome and jQuery plugins.

## Project Structure

- **Java 11**
- **Spring Boot 2.x.x**
- **Spring Security (LDAP Authentication)**
- **JavaMail (Email Services)**
- **Thymeleaf (UI)**
- **H2 Database (In-memory for testing)**

### Main Modules:

1. **Authentication**:
   - LDAP-based authentication using `SecurityConfiguration.java`.
   
2. **Email Services**:
   - Email configuration is managed by `MailConfig.java` and integrates with JavaMail to send notifications.

3. **Controllers**:
   - `IndexController.java` and `StudentController.java` manage the routing for the home and student-related operations.

4. **DTOs and Entity Classes**:
   - Data Transfer Objects (DTOs) such as `CreateStudentDTO.java`, `StudentResponseDTO.java`, and entities like `Student.java` are used to handle application data.

5. **Thymeleaf Templates**:
   - UI is rendered using Thymeleaf templates located in `src/main/resources/templates`.

## Getting Started

### Prerequisites

- **Java 11**
- **Maven 3.6.x**
- **LDAP Server** (for authentication)
