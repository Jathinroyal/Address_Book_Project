AddressBook Application
📖 Overview
The AddressBook Application is a full-stack project designed to streamline contact management. It provides a simple, user-friendly interface to add, view, and manage contacts. The application consists of a responsive frontend built with HTML and CSS, integrated seamlessly with a Spring Boot backend and a MySQL database.

✨ Features
Frontend
Home Page (index.html):

A welcoming interface with navigation buttons: Home, Add Contact, View Contacts.
Add Contact and View Contacts buttons displayed in the center for quick access.
Footer with copyright details.
Add Contact Page (addContact.html):

Input fields for Name, Email, and Phone.
Buttons for Submit, Clear, and Back to Home Page.
Redirection to index.html upon clicking "Back to Home".
View Contacts Page (viewContact.html):

A table to display all saved contacts.
A button to return to the homepage (index.html).

Backend
RESTful API: Built using Spring Boot, providing CRUD operations to manage contacts.
Database Integration: Contacts are stored and retrieved from a MySQL database.
Database
Schema: addressbook
Table: contacts
Columns:
id (Primary Key)
name
email
phone

📂 Project Structure
css
Copy code
AddressBook/
├── frontend/
│   ├── index.html
│   ├── addContact.html
│   └── viewContact.html
├── backend/
│   ├── src/main/java/
│   │   ├── com.addressbook/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   └── service/
│   └── resources/
│       └── application.properties

🚀 API Endpoints
Create Contact
POST /api/contacts

Adds a new contact.
Retrieve All Contacts
GET /api/contacts

Fetches all saved contacts.
Retrieve Contact by ID
GET /api/contacts/{id}

Fetches a specific contact.
Update Contact
PUT /api/contacts/{id}

Updates an existing contact.
Delete Contact
DELETE /api/contacts/{id}

Deletes a specific contact.
🛠️ Installation & Setup
Prerequisites
Java 11 or higher
Maven
MySQL
Git
Steps
Clone the Repository:

bash
Copy code
git clone <repository-url>
cd AddressBook
Set Up MySQL Database:

sql
Copy code
CREATE DATABASE addressbook;
USE addressbook;
CREATE TABLE contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(15)
);
Configure Backend: Update application.properties in src/main/resources:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/addressbook
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
spring.jpa.hibernate.ddl-auto=update
Run the Backend:

bash
Copy code
mvn spring-boot:run
Launch the Frontend: Open index.html in your preferred browser.

🛡️ Technologies Used
Frontend
HTML
CSS
Backend
Spring Boot
Java
REST API
Database
MySQL
📋 Future Enhancements
Add search functionality for contacts.
Implement user authentication for better security.
Enhance the UI with frameworks like Bootstrap.
🤝 Contributing
Contributions are welcome! Follow these steps to contribute:

Fork the repository.
Create a new branch.
Commit changes and push to your branch.
Submit a pull request.


🙌 Acknowledgments
I am happy for Building this project by My Own Except JavaScript.

