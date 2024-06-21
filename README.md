---

# Proyecto ORM/ODM Multiplataforma 

¡Bienvenido al Proyecto ORM/ODM Multiplataforma en Java! Se ha completado la funcionalidad para trabajar tanto con bases de datos SQL como NoSQL.

## Objetivo
Desarrollar una herramienta flexible que permita a los desarrolladores manejar objetos Java con diferentes tipos de bases de datos, incluyendo soporte para bases de datos SQL y NoSQL.

## Funcionalidades

### Conexión a Bases de Datos
- **SQL (Oracle, MySQL)**: Capacidad de conectar y manejar operaciones CRUD con Oracle y MySQL.
- **NoSQL (MongoDB)**: Capacidad de conectar y manejar operaciones CRUD con MongoDB.

### Operaciones CRUD
- **SQL**: Implementación de operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para Oracle y MySQL.
- **NoSQL**: Implementación de operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para MongoDB.

### Pruebas Unitarias
- **SQL**: Pruebas unitarias para validar la funcionalidad de `PersonaDAO` en Oracle y MySQL.
- **NoSQL**: Pruebas unitarias para validar la funcionalidad de `MongoDBDAO`.

## Estructura del Proyecto

- `com.miproyecto.Configuracion.java`: Clase que gestiona la configuración de las conexiones a las bases de datos.
- `com.miproyecto.ConexionBD.java`: Clase que gestiona la conexión a las bases de datos (Oracle, MySQL, MongoDB).
- `com.miproyecto.Persona.java`: Clase que representa un objeto Persona con atributos como id, nombre, apellido y edad.
- `com.miproyecto.PersonaDAO.java`: Clase que implementa las operaciones CRUD para la entidad Persona en Oracle.
- `com.miproyecto.MySQLPersonaDAO.java`: Clase que implementa las operaciones CRUD para la entidad Persona en MySQL.
- `com.miproyecto.MongoDBDAO.java`: Clase que implementa las operaciones CRUD para la entidad Persona en MongoDB.
- `com.miproyecto.PersonaDAOTest.java`: Clase con pruebas unitarias para validar las funciones de conectar y CRUD en las 3 bases de datos.


## Cómo Funciona

1. **Configuración**  
   Se establecen las variables de entorno para la conexión a las bases de datos (`DATABASE_URL`, `DATABASE_USER`, `DATABASE_PASSWORD`, `MYSQL_URL`, `MYSQL_USER`, `MYSQL_PASSWORD`, `MONGODB_URL`, `MONGODB_DATABASE`, `MONGODB_COLLECTION`).

2. **Conexión a la Base de Datos**  
   Se utiliza el driver correspondiente (JDBC para Oracle y MySQL, MongoDB driver para MongoDB) para conectar a la base de datos.

3. **Operaciones CRUD**  
   - **SQL**: Las clases `PersonaDAO` y `MySQLPersonaDAO` manejan las operaciones CRUD en Oracle y MySQL respectivamente.
   - **NoSQL**: La clase `MongoDBDAO` maneja las operaciones CRUD en MongoDB.

4. **Pruebas Unitarias**  
   Las pruebas unitarias validan la funcionalidad de las clases DAO con diferentes escenarios en Oracle, MySQL y MongoDB.

## Requisitos

- Java Development Kit (JDK) 8 o superior
- Driver JDBC de Oracle
- Driver JDBC de MySQL
- Driver de MongoDB (agregar a las dependencias del proyecto)

## Instalación

1. Descarga el código fuente del proyecto.
2. Configura los drivers JDBC de Oracle, MySQL y el driver de MongoDB en el classpath.
3. Crea la tabla Persona en tu base de datos Oracle y MySQL.
4. Crea la colección "Persona" en tu base de datos MongoDB.

## Uso

1. Crea un objeto `PersonaDAO`, `MySQLPersonaDAO` o `MongoDBDAO` según la base de datos que vayas a usar.
2. Utiliza los métodos correspondientes para realizar operaciones CRUD sobre la entidad Persona.

## Próximos Pasos

- Implementar el soporte para otras bases de datos NoSQL (Cassandra, etc.).
- Implementar la gestión de relaciones entre entidades para ambas bases de datos.
- Integrar la selección del tipo de base de datos a utilizar (Oracle, MySQL o MongoDB) a través de una configuración más robusta.

## Notas

Se puede utilizar una biblioteca de ODM existente, como Morphia o Spring Data MongoDB, para simplificar el proceso de generación de consultas.

---

¡Gracias por tu interés en nuestro proyecto! Si tienes alguna sugerencia o encuentras algún problema, no dudes en crear un issue o un pull request.

Con ❤️.

Dejare un video explicando un poco del proyecto:  https://youtu.be/kT1ZR8BfRDU

---
