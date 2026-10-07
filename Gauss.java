public class Gauss {

    /**
     * Método que realiza la triangulación de la matriz
     * utilizando Eliminación Gaussiana simple.
     *
     * @param matriz Matriz aumentada [A | b].
     */
    public static void eliminacionGaussiana(double[][] matriz) {

        int n = matriz.length;

        // Selecciona el renglón pivote actual
        for (int i = 0; i < n; i++) {

            // Recorre los renglones que están debajo del pivote
            for (int j = i + 1; j < n; j++) {

                // Calcula el factor para eliminar el elemento
                double factor = matriz[j][i] / matriz[i][i];

                // Realiza la operación entre filas
                for (int k = i; k <= n; k++) {

                    matriz[j][k] =
                            matriz[j][k] - factor * matriz[i][k];
                }
            }
        }
    }

    /**
     * Método que realiza la sustitución regresiva
     * para obtener el valor de las incógnitas.
     *
     * @param matriz Matriz triangular superior.
     * @return Arreglo con las soluciones del sistema.
     */
    public static double[] sustitucionRegresiva(double[][] matriz) {

        int n = matriz.length;

        // Arreglo donde se almacenan las soluciones
        double[] soluciones = new double[n];

        // Recorre las filas de abajo hacia arriba
        for (int i = n - 1; i >= 0; i--) {

            double suma = 0;

            // Suma los valores de las incógnitas ya calculadas
            for (int j = i + 1; j < n; j++) {

                suma += matriz[i][j] * soluciones[j];
            }

            // Calcula el valor de la incógnita actual
            soluciones[i] =
                    (matriz[i][n] - suma) / matriz[i][i];
        }

        return soluciones;
    }
}
