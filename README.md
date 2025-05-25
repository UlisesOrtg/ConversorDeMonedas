
<h1 align="center"> ConversorDeMonedas </h1>


Conversor de Divisas, creado con Java y consumiendo una API de divisas


# Conversor de Divisas

Aplicación de consola en Java para realizar conversiones entre distintas monedas latinoamericanas y el dólar estadounidense. Guarda el historial de conversiones en archivos JSON con formato legible.


# Propósito y Alcance

Este documento proporciona una visión general completa de la aplicación ConversorDeMonedas, un convertidor de divisas basado en consola Java que permite conversiones bidireccionales entre USD y monedas de América Latina. La aplicación se integra con las API de tipo de cambio externo y mantiene un historial de conversiones persistente a través del almacenamiento de archivos JSON.

Esta descripción general cubre la funcionalidad principal de la aplicación, los patrones de arquitectura y las relaciones de componentes. Para obtener documentación detallada de los componentes, consulte Componentes Básicos. Para obtener detalles de implementación específicos de la integración de API externa, consulte Integración API Externa. Para obtener instrucciones de configuración del entorno de desarrollo, consulte Desarrollo Entorno Configuración.

# Funcionalidad de Aplicación

La aplicación ConversorDeMonedas proporciona una interfaz de consola interactiva para realizar conversiones de moneda con las siguientes capacidades:

Característica	Descripción
Menú Interactivo	Selección basada en consola de 8 pares de divisas bidireccionales
Tarifas en Tiempo Real	Integración con exchangerate-api.com para los tipos de cambio actuales
Historial de Conversión	Almacenamiento persistente de todas las conversiones en formato JSON
Monedas Apoyadas	USD, ARS (Peso Argentino), BRL (Real Brasileño), COP (Peso Colombiano), MXN (Peso Mexicano)
La aplicación funciona a través de un simple bucle de menú donde los usuarios seleccionan tipos de conversión, cantidades de entrada, ven resultados y guardan automáticamente los registros de conversión en archivos JSON específicos de la moneda.

## Características

- Menú interactivo para seleccionar el tipo de conversión.
- Conversión entre USD, ARS, BRL, COP y MXN en ambos sentidos.
- Registro de cada conversión en un archivo JSON específico para cada par de monedas.
- Historial acumulativo y formateado (pretty printing).

## Uso

1. Ejecuta la aplicación.
2. Selecciona la conversión deseada en el menú.
3. Ingresa el monto a convertir.
4. Visualiza el resultado y revisa el historial en los archivos JSON generados.

# Pila de Tecnología y Patrones de Arquitectura

Tecnologías Core

   Componente	         /Tecnología	                                 /Propósito
-  Idioma	             / Java 17+	                             / Desarrollo de aplicaciones básicas
- Procesamiento JSON	 / Biblioteca gson	                     / Serialización/deserialización de datos de intercambio
- Cliente HTTP	       / Cliente HTTP incorporado de Java	     / Comunicación API externa
- Almacenamiento
  de Datos	           / JSON basado en archivos	             / Historial de conversión persistente
- Desarrollo
  Medio Ambiente	     / IDEA IntelliJ	                       / Configuración IDE y gestión de proyectos

## Ejemplo de menú

1. Dolar >>> Peso Argentino
2. Peso Argentino >>> Dolar
3. Dolar >>> Real Brasil
4. Real Brasil >>> Dolar
5. Dolar >>> Peso Colombiano
6. Peso Colombiano >>> Dolar
7. Peso Mexicano >>> Dolar
8. Dolar >>> Peso Mexicano
9. SALIR

## Estructura del historial (`USD_A_MXN.json`)

json
[
  {
    "Fecha": "2025-05-23",
    "Cantidad": 10.0,
    "Monto": 193.412,
    "Moneda Destino": "MXN",
    "Moneda Base": "USD"
  }
]




## Requisitos

1. Java 17 o superior
2. Gson para manejo de JSON

# Estructura del proyecto

1. src/Principal.java — Lógica principal y menú.
2. src/ConsultarCambio.java — Consulta de tasas de cambio.
3. src/Cambio.java — Modelo de datos para tasas de cambio.
4. src/HistorialCambio.java — Manejo y guardado del historial en JSON.

# Instalación

1. Clona el repositorio.
2. Asegúrate de tener las dependencias necesarias (Gson).
3. Compila y ejecuta el proyecto desde tu IDE o terminal.
   
# Licencia

Este proyecto es de uso educativo.

:construction: Proyecto en construcción :construction:


<p align="left">
<img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">
</p>

## Autores
 [<img src="https://imgs.search.brave.com/kZaSCy3iL3I-N89Ea7_Zp8ohHfMieIga_L1HiM-4Ph8/rs:fit:500:0:0:0/g:ce/aHR0cHM6Ly9pbWdz/LnNlYXJjaC5icmF2/ZS5jb20vdktqNWwy/UHU3bDBUeDdFZ0RU/UHJJNEstU2JHLXkz/Unp0SThtNkpuN215/cy9yczpmaXQ6NTAw/OjA6MDowL2c6Y2Uv/YUhSMGNITTZMeTkw/TXk1bS9kR05rYmk1/dVpYUXZhbkJuL0x6/QTFMems1THpFeEx6/WTIvTHpNMk1GOUdY/elU1T1RFeC9Oall6/TVY5eVJFUnBWR05y/L1RuazFiV1YwVVZJ/elMxSmEvTm1wVFFU/RlpWa00xVW5aRC9j/eTVxY0dj.jpeg" width=115><br><sub>Ulises Ortega</sub>](https://github.com/UlisesOrtg)  
