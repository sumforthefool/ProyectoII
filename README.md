

## Proyecto ORM/ODM Multiplataforma

Este proyecto es una herramienta flexible en Java que permite a los desarrolladores mapear objetos Java a diferentes tipos de bases de datos, incluyendo bases de datos relacionales (Oracle, MySQL) y NoSQL (MongoDB).

## Objetivo

El objetivo principal del proyecto es facilitar el desarrollo de aplicaciones Java con una mayor independencia del tipo de almacenamiento utilizado. Con este ORM/ODM, los desarrolladores pueden trabajar con objetos Java sin tener que preocuparse por los detalles específicos de la base de datos.

## Funcionalidades

Conexión a Diferentes Bases de Datos: El proyecto admite la conexión a las siguientes bases de datos:

Oracle: Se utiliza el driver JDBC de Oracle para conectar a bases de datos Oracle.

MySQL: Se utiliza el driver JDBC de MySQL para conectar a bases de datos MySQL.

MongoDB: Se utiliza el driver de MongoDB para conectar a bases de datos NoSQL MongoDB.

Operaciones CRUD: Implementa operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para cada tipo de base de datos.

Configuración Flexible: La configuración de la conexión a la base de datos se realiza a través de variables de entorno, lo que proporciona una configuración flexible y adaptable.

## Estructura del Proyecto
com.miproyecto
  ├── Configuracion.java  // Gestiona la configuración de las bases de datos
  
  ├── ConexionBD.java      // Clase para conectar a diferentes bases de datos
  
  ├── Persona.java         // Entidad Java para representar una persona
  
  ├── PersonaDAO.java     // Implementa las operaciones CRUD para Persona en Oracle
  
  ├── MySQLPersonaDAO.java  // Implementa las operaciones CRUD para Persona en MySQL
  
  ├── MongoDBDAO.java     // Implementa las operaciones CRUD para Persona en MongoDB
  
  └── test                   // Paquete para pruebas unitarias
  
      ├── PersonaDAOTest.java // Se realizan todas las pruebas
  
Requisitos:

Java Development Kit (JDK) 8 o superior

Driver JDBC de Oracle

Driver JDBC de MySQL

Driver de MongoDB (incluido en las dependencias del proyecto)

## Configuración:

Crear un archivo .env (o utilizar un administrador de variables de entorno) y agregar las siguientes variables:

DATABASE_URL: URL de conexión a la base de datos Oracle (por ejemplo, jdbc:oracle:thin:@localhost:1521:)

DATABASE_USER: Usuario de la base de datos Oracle (por ejemplo, UsuarioPrueba)

DATABASE_PASSWORD: Contraseña de la base de datos Oracle (por ejemplo, contraseña12)

MONGODB_URL: URL de conexión a la base de datos MongoDB (por ejemplo, mongodb://localhost:27017)

MONGODB_DATABASE: Nombre de la base de datos MongoDB (por ejemplo, Info)

MONGODB_COLLECTION: Nombre de la colección en MongoDB (por ejemplo, Info)

MYSQL_URL: URL de conexión a la base de datos MySQL (por ejemplo, jdbc:mysql://localhost:3306/prueba)

MYSQL_USER: Usuario de la base de datos MySQL (por ejemplo, UsuarioNormal)

MYSQL_PASSWORD: Contraseña de la base de datos MySQL (por ejemplo, contra1452)

## Cómo Utilizar

Configurar la conexión a la base de datos:

Asegúrese de que las variables de entorno estén configuradas correctamente.

Seleccionar el tipo de base de datos:

Utilice la clase ConexionBD para conectarse a la base de datos deseada (Oracle, MySQL o MongoDB).

Crear objetos Java:

Crea instancias de la clase Persona.

Utilizar las operaciones CRUD:

Utilice las clases PersonaDAO, MySQLPersonaDAO o MongoDBDAO para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos.

Pruebas Unitarias

Para ver las pruebas unitarias del proyecto, puedes consultar el siguiente enlace:

Enlace al repositorio de pruebas

Próximos Pasos:

Ampliar el soporte a otras bases de datos: Implementar el mapeo para otras bases de datos NoSQL (Cassandra, etc.).

Mejorar la gestión de relaciones: Implementar la gestión de relaciones entre entidades para ambas bases de datos.

Agregar un mecanismo para seleccionar la base de datos: Implementar una configuración o un método que permita seleccionar la base de datos (Oracle, MySQL, MongoDB) a utilizar en tiempo de ejecución.

Recomendaciones:

Utilizar una biblioteca de ODM existente como Morphia o Spring Data MongoDB para simplificar el mapeo y la generación de consultas.

