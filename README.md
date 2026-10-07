# Método de Gauss

Práctica correspondiente a la materia de **Métodos Numéricos**, en la cual se implementa el Método de Gauss para resolver un sistema de ecuaciones lineales.

## Lenguaje de programación

El programa fue desarrollado en **Java** utilizando un diseño modular.

## Estructura del programa

El proyecto está dividido en tres archivos:

- `DefMatriz.java`: define la matriz aumentada del sistema de ecuaciones.
- `Gauss.java`: realiza la eliminación gaussiana y la sustitución regresiva.
- `Principal.java`: contiene el método principal y muestra las soluciones obtenidas.

## Compilación

Para compilar el programa, abrir una terminal en la carpeta donde se encuentran los archivos y ejecutar:

```bash
javac DefMatriz.java Gauss.java Principal.java
```

## Ejecución

Después de compilar, ejecutar:

```bash
java Principal
```

## Ejemplo de prueba

El programa utiliza la siguiente matriz aumentada:

```text
 3.0  -0.1  -0.2 |   7.85
 0.1   7.0  -0.3 | -19.3
 0.3  -0.2  10.0 |  71.4
```

La salida obtenida en consola es:

```text
Soluciones del sistema:
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
```

## Descripción

El programa aplica el método de eliminación gaussiana para transformar la matriz aumentada en una matriz triangular superior. Posteriormente utiliza sustitución regresiva para calcular el valor de cada una de las incógnitas.
