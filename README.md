# Forum Alura - Challenge Oracle Next Education ONE


<p align="center" dir="auto">
<img align="center" src="https://www.servicetonic.com/wp-content/uploads/2020/10/API-Interface-Servicetonic.png" width="80%">
</p>

## Descripción del proyecto

> El foro alura es un lugar donde todos los alumnos de la plataforma alura
>pueden colocar sus preguntas sobre determinados cursos, este mágico lugar está lleno de mucho aprendizaje y de colaboración entre alumnos, profesores y moderadores.

> Ese es nuestro desafío, vamos a replicar a nivel de back end este proceso, y para eso crearemos una API REST usando Spring.

## Requerimientos

Nuestra API va a centrarse específicamente en los tópicos, y debe permitir a los usuarios:

- Crear un nuevo tópico
- Mostrar todos los tópicos creados
- Mostrar un tópico específico
- Eliminar un tópico
- Eliminar un tópico

## Software


Se desarrolló una API RESTful con conexión a la base de datos utilizando métodos Http (GET, POST, PUT, DELETE) que permite realizar acciones CRUD (Create, Read, Update, Delete). Se dío uso a Status Code para manejar las respuestas por parte del servidor al cliente.

Inicialmente se solicitaba acciones sobore los tópicos haciendo uso de la ruta `/topicos`. Adicionalmente, se implementaron otros endpoints relacionados a los tópicos lo cual permitía tener una mejor estructuración del foro:

- `/respuestas`
- `/usuarios`

Añadiendo la capa de seguridad, se implementó un servicio de autenticación y autorización el cual se debe realizar haciendo uso de la ruta `/login`. Para esto se debe contar con el email y contraseña correctas.

## Base de datos

El Diagrama de Entidad Relación de la  base de datos es la siguiente:

<p align="center" dir="auto">
<img align="center" src="https://github.com/Leonel-Amaya/Forum-Alura-Challenge-ONE/blob/main/imgs/db.png?raw=true" width="70%">
</p>

### Funcionalidades

## Tecnologías

La API se desarrollo dentro del IDE *Intellij IDEA*, empleando el lenguaje *Java* y su framework *Spring Boot*.
La base de datos usada fue *MySQL*.

Se usó el servicio en la nube de *Azure* para desplegar los servidores de
la base de datos con *Azure Database for MySQL* y *Azure App Service* para alojar la API.

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,spring,maven,mysql,postman,idea,git,github,azure&perline=5" />
  </a>
</p>

## Insignia
<p align="center" dir="auto">
<img align="center" src="https://github.com/Leonel-Amaya/Forum-Alura-Challenge-ONE/blob/main/imgs/Insignia%20Spring%20Boot.png?raw=true" width="70%">
</p>