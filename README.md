Ejercicio 8 - Refactorización de Código Acoplado hacia Factory Method

Explicación del programa

En este ejercicio se refactorizó la creación de compresores de archivos (ZIP, TAR y GZ) eliminando condicionales en el código principal y aplicando el patrón de diseño Factory Method, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz Compresor con el método comprimir(String archivo).
- Tres clases concretas (CompresorZIP, CompresorTAR y CompresorGZ) que implementan Compresor.
- Una clase abstracta CreadorCompresor que define el método de fábrica crearCompresor().
- Tres clases creadoras concretas (CreadorCompresorZIP, CreadorCompresorTAR y CreadorCompresorGZ) que devuelven cada compresor.

Luego, dentro del método main, se utilizan los creadores para obtener los compresores y comprimir los archivos.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común Compresor para unificar la operación de compresión.
- Separar la creación de cada compresor en subclases creadoras específicas.
- Evitar condicionales de selección de formato en el código cliente.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
Comprimiendo en formato ZIP: datos.txt
Comprimiendo en formato TAR: backup.dir
Comprimiendo en formato GZ: log.txt

Captura de pantalla

<img width="700" height="195" alt="image" src="https://github.com/user-attachments/assets/9bb28f02-9200-41c0-b9e1-3fc597af2cca" />
