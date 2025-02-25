# API RESTful en Spring Boot

## 📌 Descripción
Esta API RESTful ha sido desarrollada en *Spring Boot 3+* y cubre diversos aspectos del desarrollo de servicios REST, incluyendo:

- Creación de endpoints simples.
- Implementación de un CRUD básico para productos.
- Internacionalización (i18n).
- Uso de programación reactiva con WebFlux.
- Pruebas unitarias con JUnit y StepVerifier.

## 🚀 Requisitos Previos
- Tener instalado *Java 17+*.
- Tener instalado *Maven*.
- Tener instalado *Spring Boot 3+*.
- Opcionalmente, usar *Postman* para pruebas de los endpoints.

## ⚙ Configuración y Ejecución
### 1️⃣ Clonar el repositorio
sh
git clone https://github.com/tu-usuario/api-spring-boot.git
cd api-spring-boot


### 2️⃣ Construir el proyecto
sh
mvn clean install


### 3️⃣ Ejecutar la API
sh
mvn spring-boot:run


La API se ejecutará en http://localhost:8080/

## 📌 Endpoints y Pruebas

### 📝 Ejercicio 1: Endpoint Simple
*Descripción:* Un endpoint básico que devuelve un saludo.

- *GET:* http://localhost:8080/api/saludo
- *Respuesta esperada:*
json
"¡Hola, API RESTful!"


### 📝 Ejercicio 2: CRUD de Productos
*Descripción:* Implementa un CRUD para gestionar productos.

#### 📌 Endpoints CRUD:
- *POST* /api/productos → Agregar un producto.
- *GET* /api/productos → Listar todos los productos.
- *GET* /api/productos/{id} → Obtener un producto por ID.
- *PUT* /api/productos/{id} → Actualizar un producto.
- *DELETE* /api/productos/{id} → Eliminar un producto.

#### 📌 Pruebas CRUD:
Ejemplo para agregar un producto con *Postman*:
- *URL:* http://localhost:8080/api/productos
- *Método:* POST
- *Body (JSON):*
json
{
  "id": "1",
  "nombre": "Laptop",
  "precio": 1200.0
}


### 📝 Ejercicio 3: Internacionalización (i18n)
*Descripción:* Permite obtener el mensaje de saludo en diferentes idiomas.

#### 📌 Endpoints con idioma:
- http://localhost:8080/api/saludo?lang=es → "¡Hola, API RESTful en Español!"
- http://localhost:8080/api/saludo?lang=en → "Hello, RESTful API in English!"

### 📝 Ejercicio 4: Endpoint Reactivo con WebFlux
*Descripción:* Lista de productos usando programación reactiva.

#### 📌 Endpoint:
- *GET* http://localhost:8080/api/productos

*Respuesta esperada:*
json
[
  { "id": "1", "nombre": "Laptop", "precio": 1200.0 },
  { "id": "2", "nombre": "Mouse", "precio": 25.0 },
  { "id": "3", "nombre": "Teclado", "precio": 45.0 }
]


### 📝 Ejercicio 5: Pruebas con StepVerifier
*Descripción:* Prueba unitaria con StepVerifier para validar el endpoint de productos.

#### 📌 Ejecutar pruebas unitarias:
sh
mvn test


#### 📌 Prueba esperada:
sh
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: Xs
[INFO] BUILD SUCCESS


