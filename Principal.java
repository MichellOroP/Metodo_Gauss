public class Principal {

    /**
     * Método principal que ejecuta el programa.
     */
    public static void main(String[] args) {

        // Obtiene la matriz aumentada del sistema
        double[][] matriz = DefMatriz.obtenerMatriz();

        // Aplica el método de eliminación gaussiana
        Gauss.eliminacionGaussiana(matriz);

        // Realiza la sustitución regresiva
        double[] soluciones = Gauss.sustitucionRegresiva(matriz);

        // Muestra las soluciones obtenidas
        System.out.println("Soluciones del sistema:");

        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}
