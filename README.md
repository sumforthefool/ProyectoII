# Proyecto ORM/ODM Multiplataforma - Primer Avance

¡Bienvenido al primer avance de nuestro Proyecto ORM/ODM Multiplataforma en Java! Este proyecto se centra en la implementación inicial de un framework ORM con soporte para bases de datos Oracle.

## Objetivo

El objetivo es desarrollar una herramienta que permita mapear objetos Java a tablas de bases de datos relacionales y a documentos en bases de datos NoSQL, facilitando así el desarrollo de aplicaciones Java.

## Funcionalidades Actuales

### Conexión a Oracle
Utilizamos JDBC para establecer la conexión con una base de datos Oracle.

### Mapeo de Objetos
Definimos la clase `Persona` con anotaciones personalizadas para mapear sus atributos a columnas de la tabla `Persona` en la base de datos.

### Operaciones CRUD
Implementamos `PersonaDAO` para manejar las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre la tabla `Persona`.

### Generación de Consultas SQL
`PersonaDAO` genera dinámicamente consultas SQL basadas en las anotaciones de la clase `Persona`.

### Pruebas Unitarias
Incluimos pruebas unitarias para validar la funcionalidad de `PersonaDAO`.

## Estructura del Proyecto

- **com.miproyecto.ConexionBD.java**: Clase que gestiona la conexión a la base de datos Oracle.
- **com.miproyecto.Persona.java**: Clase que representa un objeto `Persona` con atributos mapeados a columnas de la tabla.
- **com.miproyecto.PersonaDAO.java**: Clase que implementa las operaciones CRUD para la entidad `Persona`.
- **com.miproyecto.PersonaDAOTest.java**: Clase con pruebas unitarias para validar el `PersonaDAO`.

## Cómo Funciona

1. **ConexionBD**: Establece una conexión a la base de datos Oracle utilizando JDBC.
2. **Persona**: Define los atributos de un objeto `Persona` y utiliza anotaciones para mapearlos a columnas de la tabla `Persona`.
3. **PersonaDAO**: Utiliza las anotaciones de la clase `Persona` para generar dinámicamente las consultas SQL para las operaciones CRUD.
4. **Pruebas Unitarias**: `PersonaDAOTest` verifica la funcionalidad correcta de `PersonaDAO`.

## Requisitos

- Java Development Kit (JDK) 8 o superior
- Driver JDBC de Oracle

## Instalación

1. Descarga el código fuente del proyecto.
2. Configura el driver JDBC de Oracle en el classpath.
3. Crea la tabla `Persona` en tu base de datos Oracle.

## Uso

1. Crea un objeto `PersonaDAO`.
2. Utiliza los métodos de `PersonaDAO` para realizar operaciones CRUD sobre la tabla `Persona`.

## Próximos Pasos

- Implementar el mapeo para otras bases de datos relacionales (MySQL, PostgreSQL, etc.).
- Implementar la funcionalidad ODM para bases de datos NoSQL (MongoDB, Cassandra, etc.).
- Implementar la gestión de relaciones entre entidades.

## Notas

- Este es un primer avance, por lo que hay margen para mejorar la funcionalidad y la arquitectura del proyecto.
- Se puede utilizar una biblioteca de ORM existente, como Hibernate o JPA, para simplificar el proceso de mapeo y generación de consultas SQL.

¡Gracias por tu interés en nuestro proyecto! Si tienes alguna sugerencia o encuentras algún problema, no dudes en crear un issue o un pull request.

---

Con ❤️.
