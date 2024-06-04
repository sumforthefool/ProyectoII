---

# Proyecto ORM/ODM Multiplataforma - Segundo Avance

¡Bienvenido al segundo avance de nuestro Proyecto ORM/ODM Multiplataforma en Java! En este avance, hemos implementado la funcionalidad de Object-Document Mapping (ODM) para trabajar con MongoDB.

## Objetivo
Continuamos con el desarrollo de una herramienta flexible que permite a los desarrolladores mapear objetos Java a diferentes tipos de bases de datos, ahora incluyendo soporte para bases de datos NoSQL.

## Nuevas Funcionalidades

- **Conexión a MongoDB**  
  Hemos integrado la capacidad de conectar con una base de datos MongoDB. La conexión se configura a través de variables de entorno para mayor flexibilidad.
  
- **Mapeo de Objetos a Documentos**  
  Ahora podemos mapear objetos Java a documentos MongoDB, lo que permite trabajar con datos estructurados en formato JSON.
  
- **Operaciones CRUD para MongoDB**  
  Implementamos la clase `MongoDBDAO` para manejar las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre colecciones de documentos MongoDB.
  
- **Pruebas Unitarias para MongoDB**  
  Se agregaron pruebas unitarias para validar la funcionalidad de `MongoDBDAO`, incluyendo escenarios de creación, lectura, actualización y eliminación de documentos.

## Estructura del Proyecto

- `com.miproyecto.ConexionBD.java`: Clase que gestiona la conexión a la base de datos Oracle (del avance 1).
- `com.miproyecto.Persona.java`: Clase que representa un objeto Persona con atributos mapeados a columnas de la tabla o a campos de documentos.
- `com.miproyecto.PersonaDAO.java`: Clase que implementa las operaciones CRUD para la entidad Persona en Oracle (del avance 1).
- `com.miproyecto.PersonaDAOTest.java`: Clase con pruebas unitarias para validar el `PersonaDAO` (del avance 1).
- `com.miproyecto.MongoDBDAO.java`: Clase que implementa las operaciones CRUD para la entidad Persona en MongoDB.
- `com.miproyecto.MongoDBDAOTest.java`: Clase con pruebas unitarias para validar el `MongoDBDAO`.

## Cómo Funciona

1. **Configuración**  
   Se establecen las variables de entorno para la conexión a MongoDB (`MONGODB_URL`, `MONGODB_DATABASE`).
   
2. **Conexión a MongoDB**  
   Se utiliza el driver de MongoDB para conectar a la base de datos.
   
3. **Mapeo a Documentos**  
   Se define la estructura de los documentos en MongoDB para representar los objetos Persona.
   
4. **MongoDBDAO**  
   Esta clase se encarga de ejecutar las operaciones CRUD (insertar, obtener, actualizar, eliminar) en la colección de documentos "Persona" de MongoDB.
   
5. **Pruebas Unitarias**  
   Las pruebas unitarias para `MongoDBDAO` validan la funcionalidad de la clase con diferentes escenarios.

## Requisitos

- Java Development Kit (JDK) 8 o superior
- Driver JDBC de Oracle (del avance 1)
- Driver de MongoDB (agregar a las dependencias del proyecto)

## Instalación

1. Descarga el código fuente del proyecto.
2. Configura el driver JDBC de Oracle y el driver de MongoDB en el classpath.
3. Crea la tabla Persona en tu base de datos Oracle (si no lo has hecho).
4. Crea la colección "Persona" en tu base de datos MongoDB.

## Uso

1. Crea un objeto `MongoDBDAO`.
2. Utiliza los métodos de `MongoDBDAO` para realizar operaciones CRUD sobre la colección "Persona" en MongoDB.

## Próximos Pasos

- Implementar el mapeo para otras bases de datos NoSQL (Cassandra, etc.).
- Implementar la gestión de relaciones entre entidades para ambas bases de datos.
- Integrar la selección del tipo de base de datos a utilizar (Oracle o MongoDB) a través de una configuración.

## Notas

Se puede utilizar una biblioteca de ODM existente, como Morphia o Spring Data MongoDB, para simplificar el proceso de mapeo y generación de consultas.

---

¡Gracias por tu interés en nuestro proyecto! Si tienes alguna sugerencia o encuentras algún problema, no dudes en crear un issue o un pull request.

Con ❤️.

---
