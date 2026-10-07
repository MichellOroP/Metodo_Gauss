public class DefMatriz {

    /**
     * Define la matriz aumentada [A | b]
     * que representa el sistema de ecuaciones lineales.
     *
     * @return Matriz aumentada del sistema.
     */
    public static double[][] obtenerMatriz() {

        return new double[][] {
                { 3.0, -0.1, -0.2,   7.85 },
                { 0.1,  7.0, -0.3, -19.3  },
                { 0.3, -0.2, 10.0,  71.4  }
        };
    }
}
