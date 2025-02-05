# Proyecto Simulador de Liga de Fútbol

Este proyecto es un simulador de liga de fútbol desarrollado con **Spring Boot (Backend)** y **Angular (Frontend)**. Aquí encontrarás los pasos para configurar el proyecto y ejecutarlo correctamente.

---

## **Requisitos**
### **Backend**
1. **Java 21**: [Descargar Java](https://adoptium.net/)
2. **Maven**: [Descargar Maven](https://maven.apache.org/download.cgi)
3. **MySQL Server**: [Descargar MySQL](https://dev.mysql.com/downloads/mysql/)

### **Frontend**
1. **Node.js**: [Descargar Node.js](https://nodejs.org)
2. **Angular CLI**:
   ```bash
   npm install -g @angular/cli
   ```

---

## **Configuración del Proyecto**
### **1. Configurar MySQL**
1. Asegúrate de que el servidor MySQL esté ejecutándose.
2. Crea una base de datos para el proyecto. **El nombre de la base de datos ya está configurado como `nombre_base_datos`, no necesitas cambiarlo.**

---

### **2. Configurar el Archivo `application.properties`**
1. En la carpeta `src/main/resources` del backend, crea un archivo llamado `application.properties` si no existe.
2. Copia y pega el siguiente contenido en el archivo:
   ```properties
   spring.application.name=AppFutbol

   # Configuración de la base de datos
   spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_datos
   spring.datasource.username=tu_usuario_mysql
   spring.datasource.password=tu_contraseña_mysql

   # Configuración de JPA
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true
   spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
   ```
3. Cambia `tu_usuario_mysql` y `tu_contraseña_mysql` por las credenciales de tu base de datos MySQL.
4. **Nota:** Este archivo no se debe subir al repositorio de GitHub, ya que contiene información sensible.

---

### **3. Inicializar el Backend**
1. Abre una terminal y navega a la carpeta `backend`:
   ```bash
   cd backend
   ```
2. Compila el proyecto con Maven:
   ```bash
   mvn clean install
   ```
3. Ejecuta el servidor:
   ```bash
   mvn spring-boot:run
   ```
4. El backend estará disponible en: [http://localhost:8080](http://localhost:8080).

---

### **4. Inicializar el Frontend**
1. Navega a la carpeta `frontend`:
   ```bash
   cd frontend
   ```
2. Instala las dependencias de Angular:
   ```bash
   npm install
   ```
3. Ejecuta el servidor de desarrollo:
   ```bash
   ng serve
   ```
4. El frontend estará disponible en: [http://localhost:4200](http://localhost:4200).

---

## **Estructura del Proyecto**
```
proyecto/
├── backend/   # Contiene el proyecto Spring Boot
│   ├── src/main/java
│   │   └── com.backend.AppFutbol  # Código fuente
│   ├── src/main/resources
│   │   └── application.properties  # Configuración de MySQL (NO subir a GitHub)
│   └── pom.xml  # Dependencias de Maven
├── frontend/  # Contiene el proyecto Angular
│   ├── src/
│   ├── angular.json  # Configuración del proyecto Angular
│   └── package.json  # Dependencias de Node.js
└── README.md  # Instrucciones del proyecto
```

---

## **Cómo Probar el Proyecto**
1. Abre dos terminales: una para el backend y otra para el frontend.
2. Inicia el backend con:
   ```bash
   mvn spring-boot:run
   ```
3. Inicia el frontend con:
   ```bash
   ng serve
   ```
4. Ve al navegador y abre [http://localhost:4200](http://localhost:4200).
5. Verifica que el frontend se comunique correctamente con el backend.