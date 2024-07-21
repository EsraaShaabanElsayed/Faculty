

# Faculty Management System

This repository contains the codebase for a Faculty Management System designed using a microservice architecture. Each system module is developed as an independent service, and Docker is used to containerize the application.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Microservice Architecture](#microservice-architecture)
- [Directory Structure](#directory-structure)
- [Setup](#setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

The Faculty Management System is a comprehensive solution for managing faculty-related activities. It simplifies the process of administration, course management, student enrollment, and teacher assignments through a microservice architecture.

## Features

- **Admin Module**: Manage administrative tasks and settings.
- **Course Module**: Handle course creation, updates, and deletion.
- **Enrollment Module**: Manage student enrollments in various courses.
- **Student Module**: Maintain student records and information.
- **Teacher Module**: Manage teacher information and assignments.

## Technologies Used

- **Backend**: Spring boot 

- **Database**: Mongo DB 
- **Containerization**: Docker
- **Microservices**: Independent services for Admin, Course, Enrollment, Student, and Teacher modules

## Microservice Architecture

The Faculty Management System is developed using a microservice architecture. Each module is an independent service, allowing for better scalability and maintainability.

- **Admin Service**: Manages administrative tasks.
- **Course Service**: Handles operations related to courses.
- **Enrollment Service**: Manages student enrollments.
- **Student Service**: Maintains student records.
- **Teacher Service**: Manages teacher information and assignments.

## Directory Structure

```
facultyR3/
├── .vscode/
├── .idea/
├── Admin/
├── Course/
├── Enrollment/
├── Student/
├── Teacher/
├── docker-compose.yml
└── .project
```

- **Admin/**: Contains the code related to the administration service.
- **Course/**: Contains the code related to the course management service.
- **Enrollment/**: Contains the code related to the enrollment service.
- **Student/**: Contains the code related to the student service.
- **Teacher/**: Contains the code related to the teacher service.
- **docker-compose.yml**: Docker configuration file for containerizing the microservices.
- **.vscode/** and **.idea/**: Configuration files for development environments.

## Setup

To set up the project locally, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/EsraaShaabanElsayed/faculty.git
   ```
2. Navigate to the project directory:
   ```
   cd faculty
   ```
3. Set up the necessary environment variables and configurations.
4. Build and run the Docker containers:
   ```
   docker-compose up --build
   ```







-
