# Proyecto `eu.andreatt.ejerciciop_dein` (NO FUNCIONA)

## Descripción
Este proyecto es una aplicación JavaFX que muestra una interfaz gráfica con varias imágenes (`leche.png`, `manzana.png`, `pan.png`, y `trigo.png`).

## Estructura de Archivos
- `P.java`: Clase principal que lanza la aplicación.
- `fxml/P.fxml`: Archivo FXML que define la estructura de la interfaz.
- `images/`: Carpeta que contiene imágenes utilizadas en la interfaz.
- `module-info.java`: Archivo de configuración de módulos.
- `README.md`: Guía para ejecutar el proyecto.

## Requisitos
- Java 11 o superior
- JavaFX configurado en el `module-path`

## Configuración y Ejecución

### Compilación
1. Asegúrate de tener configurado el `module-path` de JavaFX.
2. Compila el proyecto ejecutando:
   ```sh
   javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml -d out src/eu/andreatt/ejerciciop_dein/**/*.java
