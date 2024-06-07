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



  --------------------------------------------------------------------------------
# Overview of the project

  I have Developed CRUD Api using Spring Boot and UI can Development in Recat JS + Vite Project. I have used Git and Gihub for Branching and Pull Request. I have used it for Deployemnt to Docker, Docker Hub, Kubernetes, and AWS. 

# Prerequisites for running the application

### Tech Stack

### Frontend Stack
- HTML
- Tailwind CSS
- React JS
- JavaScript

### Backend Stack

## Distributed Systems
- Git
- GitHub
- Github Action ( CI/DI)

## Api 
- Spring Boot, MVC,Spring
- Java
- Postman (Api Testing)

## Cloud 
- Docker, Docker Hub
- Kubernetes (EKS)
- AWS (EKS,IAM, EC2,Elastic IP,VPC, Cloud Formation)

  
  
### Instructions to Development of UI and set up and run the backend API

## Frontend UI (React JS + vite)
- Create a Functional component to Add, Update, Delete, and List Views.
- React Router Dom is used for Router the pages, Twilwind Css used for Basic Styling
- React Material UI, Axios Api Fetch can also used for Backed API Fetch
- Docker image can be stored in Docker Hub Repo using CI/DI Basic Pipeline.
- React JS also used Events Handling and Hooks(UseState, UseEffect)
- we can use vite Project for fast Productive and effective work,
- Best Practice we can also use Prettier for code formatting, save time and energy, more productive
- also used eslinetrc Configure for auto incorrect pattern detection on code, improving code quality, making code more consistent, and avoiding bugs
- Bonus on ChatGPT 4o and 3
- Build Project we can dist folders that are there.

- Fronted cab deploy on netlify deploy (Server is down,please message server can on)
- server can run on localhost(core policy also add) and kubernateve
https://assigmentb.netlify.app/

## Backend Development
- I have used the Eclipse package to Develop of API
- I have used the MVC model for this project.
- Full path :-  React JS UI -->  (Request Class) --> Controller --> Handler --> Service Interface --> Service --> Dao Interface(Mysql and Postgrest used CRUD or JPA Repo for CRUD metthod) --> Dao (Optional) -->(Response Class)
- Controller: Api Endpoints and Request Class parameter
- Service:- Write main logic for any API (CRUD) , Example:- Login, Register, E-KYC,Product Invoice, payment logic, payment integration
- Dao:- interact with databases like Mysql, PostgreSQL, MongoDB, and Write Custome Query.
- Request and Response class can follow to input and output data.
- Best Practice package used constant, Utils, common request and common response also created.
- Build project then Jar can Created and Production level jar can run.

## Api Endpoints and 
# this project I have Development 5 API using Spring boot:-
- Get API:- get model data
- Put API:- update model data
- Delete API:- delete model data
- Get All Api:- get all data
- Post Api:- add data

- All APIs can Test using Postman

## Cors policy
- configure file for core policy to allow all Fronted side IP addresses or localhost addresses to configure
- Because everyone can not call backed API fetch they need to allow permission to be set for the Backend side.

## Api Testing
- we used Postman to Test All API
- post and put a used json body and all other API can used ID for URL

## Database Connection
- Database connection we can use an Application.yaml file to configure data
- this file we can use used Development level and Production level configuration but we can here.
- application.dev.yaml, application.prod.yaml file for Profile used for all environmental like Dev, QA, and Production.
- we can use ORM dependence like JPA to connect databases from object to table.

## Validation
- i have used validation dependence for model attributes can validate.

## Swagger Api
- I have add dependency on Spring boot project.
- I have used this only locally.
- I have worked both Swagger Api and Readme for api documentation.

## Distributed Systems
## Information on how to add the evaluator as a collaborator on GitHub
- Git:- git all command can used like >>> git add -A, git commit, git clone,git remote -v, git pull and push origin, add origin, git branch, git status,git chechout -b branch
- GitHub:- we can create a repo, create a sub or child branch, Pull request, review branch, merge branch etc
- Github Action ( CI/DI):- Create Automation workflow for any update on the branch
  Example:- we can push on the branch then the automatical pipeline can run (estimated time of pipeline 2 min to 3 min approx)
  Build Docker file image for Fronted and Backend --> Docker Hub Login (Add secret ID and password)  -->  push docker image in docker hub
  we can automate here for Deployment, only Continue Integeration can add and deployment can be manual.

- here at GitHub we can always work with the team and Team Lead. if the client can demand a new feature then we can distribute work on the Branch to the Development branch.
- always push your command and then check any updates on the development branch, your teammate can push their code in the main development branch then you can pull the latest code after the merge you used for PULL REQUEST.
- many PULL REQUEST can also be viewed by Team Lead after the Team Team can issue suggestions on Git Hub. review pull requests after the team lead can merge the PL code.
- we can also use Tag for Release updates like v1,v2 and many more.
- i have work on Agile Methodology for Daily Scrume Met for 5-10 min. Two Week Sprint view for Team Lead, One Month meeting with all team members, Scrum Master, and Product Owner to new Month Plane.
- i have used for collaboration work Tools like Email, Microsoft Team, Google Meet, and Jira for Feature Timeline
- End of the day Daily Logging Hour on jira (Some time miss it for logging)
- Also we can collaborate with team for Client Discussion, Pizza Party and many more

## Branch workflow (original) 
- main(Production branch)
- staging (Pre-Production Branch)
- Qa (Testing Branch)
- Developer (Dev branch) -- many Feature branches to many Developer

## my workflow 
- main
- Development

### kubernative and Docker with AWS

##Docker
- Docker we can Create a Dockerfile for the Frontend and Backend to image.
- Docker images can be stored in Docker Hub or Amazon Container Registry.
- Docker ps, docker image, docker login, docker pull and push image command in Docker
- here this project we automate build a docker image and pull on the Docker hub using CI/DI pipeline using Github action

## Kubernative with AWS
- Kubernative can run on cloud and local.
- Cloud:- EKS,AKS
- Local:- minikube

# First step
- create Kubernative Cluster using minikube,kind or eksctl
- Kubernative Cluster can hold one master node and worker nodes.

# Second Step
- Login to AWS and Create one EC2 instance and connect to SSH using a private key or browser.
- Create IAM used to apply all policies like Admin Access.
- Login aws cli to IAM user on EC2 instance

# Third step
- install Kubectl and eksctl on EC2 instance
- install kubectl
- curl -o kubectl https://amazon-eks.s3.us-west-2.amazonaws.com/1.19.6/2021-01-05/bin/linux/amd64/kubectl
  chmod +x ./kubectl
- install eksctl
- eksctl create cluster --name three-tier-cluster --region us-west-2 --node-type t2.medium --nodes-min 2 --nodes-max 2
- Setup First Cluster in Kubernative using eksctl code
- eksctl create cluster --name three-tier-cluster --region us-west-2 --node-type t2.medium --nodes-min 2 --nodes-max 2
- connect cluster and kubectl using this command in EC2
- aws eks update-kubeconfig --region us-west-2 --name three-tier-cluster

- Kubectl:- communicate or status of Kubernative Cluster like Pods, Deployment,service.
- kubectl get pods,kubectl get deployment,kubectl get svc,kubectl version,kubectl logs,kubectl describe,kubectl apply -f  and many more
- eksctl:- create Cluster for Kubernative and backend side cloud formation can create all thinks.

# Fouth step:-
- create yaml or manifest file for Deployment, service and secrets, ingress, and Load Balancer
- Deployment.yaml file:- image can deploy in pods
- Service.yaml file :- communicate inside pods using service Example:-database can communicate with Spring boot app
- secrets.yaml file:- hold all secrets like database username and password
- ingress :- it is simple routing like react-router dom --> you have three pods frontend, backend and database in three different pods for different IPv4 address --> you can access any one using ingress
- Load balancer:- user can not direct access for a cluster then we can use a load balancer to load balance and interact with Kubernetes Cluster.

# Five step:-
- yaml file can write is very hard then we can used Helm chart for pre-define Structure for deployment, service,secrets, horizontal scale and help.
- we can used window then used choclate for install the helm chart
- helm can have value.yaml,chart.yaml and template folder are there.
- you can change the helm chart and apply for easy to-create manifest file

# six step:-
- used kubectl and deployed all pods.






  

  


  
  
  
  
   
  







  


  

     
