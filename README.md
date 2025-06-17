Proyecto: Conversor de Monedas en Java
Este proyecto es una aplicación de consola escrita en Java que permite convertir montos entre diferentes monedas utilizando la API de ExchangeRate. El sistema utiliza la librería Gson para procesar datos en formato JSON y está organizado con paquetes siguiendo buenas prácticas.
Características
- Selección de moneda de origen y destino
- Conversión en tiempo real usando una API pública
- Validación para evitar monedas repetidas
- Muestra de resultados con 3 decimales
- Estructura modular usando clases separadas (`Conexion`, `Moneda`, etc.)
Tecnologías utilizadas
- Java 17 o superior
- Biblioteca externa: [Gson (Google)](https://github.com/google/gson)
- API de tipo de cambio: [https://www.exchangerate-api.com](https://www.exchangerate-api.com)
Estructura del proyecto
proyecto_conversor_monedas/
├── src/
│ └── com/
│ └── aluracursos/
│ └── screenmatch/
│     ├── principal/
│          └── Principal.java # Clase main
│     ├── modelos/
│           ├── Conexion.java # Lógica de consulta a la API
│           └── Moneda.java # Modelo de datos
│ └── lib/
│     └── gson-2.13.1.jar # Librería Gson
├── out/ # Archivos .class compilados
└── README.md
Autor
Jherson Medrano
Estudiante de Ingeniería de Sistemas
Proyecto académico - Curso de Java ALURA
