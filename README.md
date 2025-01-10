### REST API for Medical Management

This REST API, developed with Spring Boot and Spring Security, allows managing data related to doctors through HTTP requests. The API is designed to be secure, scalable, and user-friendly, providing a set of endpoints for performing CRUD operations (Create, Read, Update, and Delete) on doctor data.

---

### Data Structure

The API uses two Java records to represent doctor and address information:

**`DatosRegistroMedico`**: This record contains the basic information of a doctor, including:

- **`nombre`**: The doctor’s name (required).  
- **`email`**: The doctor’s email address (required and must be in a valid format).  
- **`telefono`**: The doctor’s phone number (required).  
- **`documento`**: A document number that must be between 4 and 6 digits (required).  
- **`especialidad`**: The doctor’s specialty (required).  
- **`direccion`**: An object of type `DatosDireccion` that contains the doctor’s address (required).  

**`DatosDireccion`**: This record represents the doctor’s address and includes:

- **`calle`**: The street address (required).  
- **`distrito`**: The district (required).  
- **`ciudad`**: The city (required).  
- **`numero`**: The address number (required).  
- **`complemento`**: Additional information about the address (required).  

---

### Endpoints

The API provides several endpoints to interact with doctor data:

- **`POST /medicos`**: Creates a new doctor record. A JSON object with `DatosRegistroMedico` data is expected.  
- **`GET /medicos`**: Retrieves a list of all doctors registered in the system.  
- **`GET /medicos/{id}`**: Retrieves information about a specific doctor using their ID.  
- **`PUT /medicos/{id}`**: Updates information for an existing doctor. A JSON object with updated `DatosRegistroMedico` data is expected.  
- **`DELETE /medicos/{id}`**: Deletes a specific doctor record using their ID.  

---

Aquí tienes la sección actualizada con la información sobre el uso de MySQL y Flyway para la gestión de registros en la API:

---

### Database Integration with MySQL and Flyway

This REST API leverages **MySQL** as its relational database for storing doctor and address data. MySQL provides a robust and reliable storage solution, ensuring high performance and scalability for medical management needs. 

To manage database schema migrations, the API uses **Flyway**, a popular version control tool for databases. Flyway simplifies the process of applying schema changes and keeps the database structure consistent across development, staging, and production environments.

#### Key Features of Flyway in this API:
1. **Schema Management**:
   - Flyway automates the creation and versioning of database schemas, ensuring that the structure aligns with the application's requirements.
   - Migration scripts are written in SQL and stored in the `src/main/resources/db/migration` folder.

2. **Seamless Updates**:
   - Whenever the application starts, Flyway checks for new migration scripts and applies them in the correct order, updating the database schema without manual intervention.

3. **Consistency Across Environments**:
   - Using Flyway guarantees that all environments (development, staging, and production) have the same schema, reducing deployment errors.

---


### Security

The API is secured using **Spring Security** with **JSON Web Tokens (JWT)** for authentication and authorization. This implementation ensures that:  

1. Only authenticated users can access the endpoints by requiring a valid JWT in the `Authorization` header for each request.  
2. Role-based access control is enforced to restrict specific endpoints to authorized users.  
3. JWT tokens are signed and validated to prevent tampering and ensure secure communication.  

This approach provides a stateless security mechanism, reducing server-side overhead and enhancing scalability. 


---

### Validation

The API uses Java validation annotations (such as `@NotBlank`, `@Email`, `@Pattern`, and `@NotNull`) to ensure that incoming data meets the required standards before processing. This helps maintain data integrity and prevents application errors.



<H2>JSON</H2>: 
```json
{
  "nombre": "Dr. Andres Ta",
  "email": "carlos.ta@example.com",
  "documento": "1085322222",
  "telefono": "3213282900",
  "especialidad": "ORTOPEDIA",
  "direccion": {
    "calle": "Av. el dorado",
    "distrito": "Doce",
    "complemento": "Departamento 101",
    "numero": "777-1234",
    "ciudad": "Bogota"
  }
}
```


