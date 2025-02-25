# Practicas Administración de TI UMG - Practica No. 1 Test Unitarios

<img src="./src/img/Umg.png" alt="Logo de la UMG" width="200" />

**Universidad Mariano Gálvez de Guatemala**  
**Campus Huehuetenango**  
**Administración en TI 2025**

Este proyecto es una práctica de test unitarios en Java utilizando JUnit 5. La aplicación permite gestionar usuarios mediante operaciones como crear, obtener y actualizar usuarios, así como gestionar puestos a través de un servicio dedicado.

## Requisitos

- **JDK 11 o superior**
- **JUnit 5**
- **Cualquier IDE que soporte JUnit 5**

## ¿Qué Hace Cada Test?

### 1. **Test de Creación de Usuario**  
Verifica que el método `crearUsuario` cree correctamente un usuario con los datos proporcionados (DPI, nombre y sueldo).

### 2. **Test de Obtención de Usuario**  
Verifica que el método `obtenerUsuario` recupere correctamente un usuario previamente creado.

### 3. **Test de Actualización de Usuario**  
Verifica que el método `actualizarUsuario` actualice correctamente los datos de un usuario.

### 4. **Test de Creación de Puesto**  
Verifica que el método `crearPuesto` cree correctamente un puesto con los datos proporcionados (nombre y salario).

### 5. **Test de Obtención de Puesto**  
Verifica que el método `obtenerPuesto` recupere correctamente un puesto previamente creado.

### 6. **Test de Actualización de Puesto**  
Verifica que el método `actualizarPuesto` actualice correctamente los datos de un puesto, como el salario.

## ¿Cómo Ejecutar los Tests?

1. **Abrir el Proyecto**  
   Abre el proyecto en tu IDE preferido (recomendado IntelliJ IDEA).

2. **Ejecutar los Tests**  
   - Navega a la clase `UsuarioServicioTest` o `PuestoServicioTest`.
   - Haz clic derecho sobre la clase o el método de prueba que deseas ejecutar y selecciona **Run**.

3. **Ver Resultados**  
   Los resultados se mostrarán en la ventana de ejecución de tu IDE, indicando si las pruebas pasaron o fallaron.

¡Y eso es todo! Los test unitarios aseguran que el servicio de gestión de usuarios y puestos funcione correctamente antes de ser utilizado en un entorno real.

## ¿Cómo Clonar el Repositorio?

1. Clona el repositorio utilizando el siguiente comando:

   ```bash
   git clone https://github.com/ItsFernan17/Practicas-Administracion-TI-2025.git
   cd proyecto-test-unitarios
