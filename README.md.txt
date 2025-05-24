

# ConversorDeMonedas
Conversor de Divisas, creado con Java y consumiendo una API de divisas


# Conversor de Divisas

Aplicación de consola en Java para realizar conversiones entre distintas monedas latinoamericanas y el dólar estadounidense. Guarda el historial de conversiones en archivos JSON con formato legible.

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
<p align="left">
<img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">
</p>
