# Model_Assignment_Full_Stack
This is Basic Crud operation with Reactjs with vite project and Backed use Spring boot and Postgrest


## Assignment Details

### 1. Create a Task Model

#Fields:#
- `id` (int)
- `name` (string)
- `description` (string)
- `status` (string)
- `dueDate` (date)

### 2. REST API Endpoints for Task Model

#Operations:#
- #POST /tasks# - Create a new task

#Data Validations:#
- `name` cannot be empty
- `dueDate` should be a future date

#Responses:#
- Return #400 Bad Request# on validation error.
- Return #201 Created# with the task `id` as the response on success.
- `status` should always be set as `CREATED` for new tasks.

### 3. Enable Swagger for API Documentation

### 4. Write a Dockerfile to Containerize the Microservice

### 5. Provide Helm Charts to Deploy the Container in Kubernetes

### 6. Write a README to Evaluate Your Submission

### 7. Push the Code to a Private GitHub Repository and Add the Evaluator as a Collaborator

#Technology Stack:#
- Java 11+
- Spring Boot
- PostgreSQL
- Docker
- Kubernetes

### Additional Front-End Tasks

#Using React JS:#

- Display Tasks
- Add Tasks
- Edit Tasks
- Delete Tasks

#Using API JavaScript to interact with the backend API.#

---

## Implementation Details

### Task Model (Spring Boot)

Define a Task model with the specified fields and ensure appropriate validations for the fields.

### REST API Controller (Spring Boot)

Create a REST API controller to handle the creation of tasks with the necessary endpoints and validations.

### Swagger Configuration

Enable Swagger for API documentation to facilitate easy testing and exploration of the API endpoints.

### Dockerfile

Write a Dockerfile to containerize the Spring Boot application.

### Helm Charts

Provide Helm charts to deploy the Docker container in a Kubernetes cluster, including deployment and service configurations.

### Front-End (React JS)

#TaskList Component:#

Create a component to display a list of tasks by fetching them from the backend API.

#AddTask Component:#

Create a component to add a new task, ensuring it interacts with the backend API to post the new task.

### README

Write a comprehensive README file that includes:
- Overview of the project
- Prerequisites for running the application
- Instructions to set up and run the backend API
- Instructions to set up and run the front-end application
- API endpoints and their descriptions
- Details on how to deploy the application using Docker and Kubernetes
- Information on how to add the evaluator as a collaborator on GitHub
- Submission guidelines to ensure all code is pushed to the Public repository before the deadline : 2 Days Effective from today .

