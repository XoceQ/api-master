<H1>API REST</H1>
Characteristics of your REST API:
REST (Representational State Transfer) architecture:

The API follows REST principles by exposing endpoints via HTTP (@RestController and @RequestMapping).
It defines a resource (/medical) that represents the Medical entity.
Use of HTTP verbs:

The registerMedico method is associated with the HTTP POST verb via @PostMapping. This verb is commonly used to create resources on a server.
Data exchange in JSON format:

The method expects a request body (@RequestBody) in JSON format containing the data from the Medical resource.
This approach is standard in modern REST APIs.
Separation of responsibilities:

The controller (MedicoController) is responsible only for handling HTTP requests and delegates business logic (when implemented) to other layers.
Stateless:

REST promotes that APIs do not maintain information about the state of the client-server interaction. Each request includes all the information needed to process it, as in this case a doctor's data in the body of the request.
Clearly defined endpoint:

The /doctors endpoint represents a set of resources related to doctors.




<H2>JSON</H2>: 
{
  "nombre": "Dr. Juan Pérez",
  "especialidad": "ORTOPEDIA",
  "telefono": "+52 55 1234 5678",
  "email": "juan.perez@hospital.com",
  "direccion": {
    "calle": "Av. Reforma",
		"numero": "123",
    "ciudad": "Ciudad de México",
    "estado": "CDMX",
    "codigoPostal": "06600"
  }
}
