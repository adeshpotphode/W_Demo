Full Stack Development Project - Description Document

Project Overview:

This is a full-stack application developed using Spring Boot for the backend, Thymeleaf as the templating engine, and MySQL for the database. The project has a landing page and an admin panel to manage projects, clients, contact form details, and newsletter subscriptions.

The application is deployed on Render with PostgreSQL as the cloud database.

Tech Stack:

Frontend: HTML, CSS, JavaScript, Thymeleaf

Backend: Spring Boot (Java)

Database: MySQL (Primary), PostgreSQL (Cloud)

Deployment: Render (Cloud Hosting)

Version Control: GitHub (Do not use the name "Flipr" in repo/code)

Features Implemented

1. Landing Page

• Our Projects Section

Displays all the projects fetched from the backend

Fields:

Project Image

Project Name

Project Description

Dummy "Read More" button (non-functional)

• Happy Clients Section

Displays all the clients with:

Client Image

Description

Name

Designation

• Contact Form

Users can submit their details:

Full Name

Email Address
̶- Mobile Number

City

Details are saved to the database and viewable in the admin panel

• Newsletter Subscription

Users can subscribe to newsletter

Email address gets stored in the backend

2. Admin Panel

• Project Management

Admin can add new projects

Fields:

Project Image

Name

Description

• Client Management

Admin can add client details:

Client Image

Name

Description

Designation

• Contact Form Details

Admin can view all submitted responses:

Full Name

Email

Mobile

City

• Subscribed Email Addresses

Admin can view all email subscribers

Bonus Feature (In Progress)

• Image Cropping

Crop uploaded images to 450x350 resolution before saving (currently not implemented)

Getting Started

1. Clone the Repository

git clone <your-repo-url>
cd <your-project-folder>

2. Configure the Database
Create a MySQL or PostgreSQL schema and configure the connection in src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

3. Build the Application
mvn clean install

4. Run the Application
mvn spring-boot:run

App will be available at: http://localhost:8080

Deployment Guidelines:

Deploy both frontend and backend on any cloud platform (Render, Heroku, AWS, etc.)

Database: PostgreSQL preferred for cloud, MySQL for local development

Evaluation Criteria:

All required features implemented and functional

Clean and modular code

UI/UX as per reference image

Easy navigation and user-friendly admin panel

Submission Instructions:

Upload the code on GitHub/GitLab/Bitbucket (public access)

Do not use "Flipr" in repository name or comments

Share the repository link

Ensure all files are accessible publicly

Prepared By:

Adesh PotphodeContact No: 7223980089Date: 1 July 2025


