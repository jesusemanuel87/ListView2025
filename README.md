# ListView2025 - Aplicación de Ejemplo

## Descripción

**ListView2025** es una aplicación de Android desarrollada como ejemplo para demostrar el uso de `ListView` para mostrar una
lista de propiedades (inmuebles). La aplicación implementa el patrón de arquitectura MVVM (Model-View-ViewModel) para una mejor 
organización del código y mantenibilidad.

## Características Principales

*   Visualización de una lista de inmuebles con detalles como dirección, superficie, precio y foto.
*   Diseño de item personalizado para cada inmueble en la lista.
*   Implementación del patrón Repositorio para la obtención de datos.
*   Uso de `ViewModel` y `LiveData` para manejar el estado de la UI y la comunicación entre la vista y la lógica de negocio.
*   Formateo de precios en moneda local (pesos argentinos) sin decimales.
*   Adaptador personalizado (`InmuebleAdapter`) para poblar el `ListView`.

## Tecnologías Utilizadas

*   **Lenguaje:** Java
*   **Arquitectura:** MVVM (Model-View-ViewModel)
*   **Componentes de Android Jetpack:**
    *   ViewModel
    *   LiveData
*   **UI:**
    *   ListView
    *   ConstraintLayout
    *   ImageView, EditText (utilizado como TextView no editable)
*   **Patrones de Diseño:**
    *   Repositorio
    *   Singleton (para el Repositorio)
*   **IDE:** Android Studio
*   **Sistema de Build:** Gradle

## Estructura del Proyecto

El proyecto sigue una estructura organizada para separar las responsabilidades:

*   `com.example.listview2025`: Paquete raíz de la aplicación.
    *   `MainActivity.java`: Actividad principal que muestra la lista de inmuebles.
    *   `InmuebleAdapter.java`: Adaptador personalizado para el `ListView`.
    *   `model/Inmueble.java`: Clase de modelo que representa una propiedad.
    *   `repository/InmuebleRepository.java`: Repositorio encargado de proveer los datos de los inmuebles (actualmente con datos de ejemplo).
    *   `viewmodel/MainActivityViewModel.java`: ViewModel que prepara y gestiona los datos para `MainActivity`.
*   `res/layout/`: Contiene los archivos de diseño XML.
    *   `activity_main.xml`: Diseño de la pantalla principal.
    *   `item.xml`: Diseño para cada ítem de la lista de inmuebles.
*   `res/drawable/`: Contiene los recursos de imágenes (fotos de las casas).

## Cómo Ejecutar el Proyecto

1.  Clona este repositorio (o asegúrate de tener el proyecto en tu máquina).
2.  Abre el proyecto con Android Studio (versión compatible con el AGP y Gradle utilizados).
3.  Asegúrate de tener un emulador de Android configurado o un dispositivo físico conectado y habilitado para depuración USB.
4.  Sincroniza el proyecto con los archivos Gradle si es necesario.
5.  Ejecuta la aplicación seleccionando el módulo `app` y el dispositivo/emulador deseado.

## Posibles Mejoras Futuras

*   Reemplazar `EditText` por `TextView` en `item.xml` para los campos que solo muestran información.
*   Implementar la carga de datos desde una fuente externa (API, base de datos local).
*   Añadir funcionalidad de clic en un ítem para ver detalles en una nueva pantalla.
*   Mejorar el manejo de errores y estados de carga.
*   Utilizar `RecyclerView` en lugar de `ListView` para una mayor eficiencia y flexibilidad.

---
Creado como parte de un ejercicio de desarrollo en Android.
