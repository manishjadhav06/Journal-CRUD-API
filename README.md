# Spring Boot CRUD API

This project is a simple Spring Boot API that supports CRUD (Create, Read, Update, Delete) operations through URL endpoints. It doesn't have an interface; Postman is used to interact with the API. The JSON data is stored in a table automatically created in the H2 in-memory database.

## Features
- **Create**: Add new JSON objects to the list.
- **Read**: Retrieve JSON objects from the list.
- **Update**: Modify existing JSON objects in the list.
- **Delete**: Remove JSON objects from the list.

## How to Use
1. **Clone the Repository**:
    ```bash
    git clone https://github.com/manishjadhav06/Journal-CRUD-API.git
    cd Journal-CRUD-API
    ```

2. **Build and Run the Application**:
    ```bash
    ./mvnw spring-boot:run
    ```

3. **Use Postman to Interact with the API**:
   **It contains 3 fields: id, title, and content. The data to be pushed needs to be in JSON format.**
    For eg. {
               id:1,
               title: "New title",
               content: "New content"
            }
    - **POST** `localhost:8080/journal`: Add a new JSON object.
    - **GET** `localhost:8080/journal`: Retrieve all JSON objects.
    - **GET** `localhost:8080/journal/id/{id}`: Retrieve a JSON object by its ID.
    - **PUT** `localhost:8080/journal/id/{id}`: Update a JSON object by its ID.
    - **DELETE** `localhost:8080/journal/id/{id}`: Delete a JSON object by its ID.

## How It's Built
- **Framework**: Spring Boot
- **Language**: Java
- **Data Storage**: H2 in-memory database
- **API Testing**: Postman

The project demonstrates the following concepts:
- Setting up a Spring Boot project.
- Creating RESTful API endpoints.
- Handling JSON data with Java.
- Using Postman for API testing and interaction.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## Acknowledgements
- Spring Boot documentation: [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- Postman documentation: [Postman Learning Center](https://learning.postman.com/)
