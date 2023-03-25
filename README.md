Portfolio Backend
¡Bienvenido al repositorio! Este proyecto fue creado para servir como servidor backend para una aplicación web de portafolio personal.

Descripción
Este servidor backend está diseñado para ser utilizado junto con la aplicación de portafolio personal que desees desarrollar. Proporciona endpoints API Restful para varias operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para el manejo de recursos de usuarios y proyectos. El proyecto está desarrollado en el framework SpringBoot y utiliza Maven para la administración de dependencias.

Requisitos
Java (versión 11)
Maven (versión 3 o superior)
MySQL (debe estar instalado y en ejecución en tu equipo o en línea)
Instalación
Clona este repositorio.
Importa el proyecto en tu IDE de Java favorito (Eclipse, IntelliJ, etc.) como un proyecto Maven existente.
Crea la base de datos portfolio_backend en MySQL. Asegúrate de incluir lo siguiente en tu archivo application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/portfolio_backend?useSSL=false&serverTimezone=UTC
spring.datasource.username=[tu usuario de MySQL]
spring.datasource.password=[tu contraseña de MySQL]
spring.jpa.hibernate.ddl-auto=create
server.port=[puerto en la que se ejecutará tu aplicación]
Inicia el servidor utilizando la opción "Run As > Spring Boot App" en tu IDE o mediante Maven:
mvn spring-boot:run
Endpoints
El servidor backend incluye los siguientes endpoints API Restful para los datos del usuario y los datos del proyecto:

User Endpoints
GET /users - Obtiene todos los usuarios registrados.
GET /users/:id - Obtiene un usuario según su id.
POST /users - Añade un nuevo usuario.
PUT /users/:id - Actualiza la información del usuario según su id.
DELETE /users/:id - Elimina un usuario según su id.
Project Endpoints
GET /projects - Obtiene una lista de todos los proyectos registrados.
GET /projects/:id - Obtiene un proyecto según su id.
POST /projects - Añade un nuevo proyecto.
PUT /projects/:id - Actualiza la información del proyecto según su id.
DELETE /projects/:id - Elimina un proyecto según su id.
Autor
Este proyecto fue desarrollado por [Maximiliano Candia](https://github.com/candiamaximiliano).

Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulte el archivo LICENSE para obtener más detalles.

¡Gracias por revisar mi proyecto! Si tienes algún comentario, sugerencia o necesitas ayuda, por favor, ¡no dudes en contactarme!
