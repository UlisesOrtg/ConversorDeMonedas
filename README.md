
<h1 align="center"> ConversorDeMonedas </h1>


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

:construction: Proyecto en construcción :construction:


<p align="left">
<img src="https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green">
</p>

## Autores
 [<img src="https://imgs.search.brave.com/kZaSCy3iL3I-N89Ea7_Zp8ohHfMieIga_L1HiM-4Ph8/rs:fit:500:0:0:0/g:ce/aHR0cHM6Ly9pbWdz/LnNlYXJjaC5icmF2/ZS5jb20vdktqNWwy/UHU3bDBUeDdFZ0RU/UHJJNEstU2JHLXkz/Unp0SThtNkpuN215/cy9yczpmaXQ6NTAw/OjA6MDowL2c6Y2Uv/YUhSMGNITTZMeTkw/TXk1bS9kR05rYmk1/dVpYUXZhbkJuL0x6/QTFMems1THpFeEx6/WTIvTHpNMk1GOUdY/elU1T1RFeC9Oall6/TVY5eVJFUnBWR05y/L1RuazFiV1YwVVZJ/elMxSmEvTm1wVFFU/RlpWa00xVW5aRC9j/eTVxY0dj.jpeg" width=115><br><sub>Ulises Ortega</sub>](https://github.com/UlisesOrtg)  
