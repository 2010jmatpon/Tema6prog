package Actividad6_3;

public class ComplejidadAlgoritmica {
    public static void main(String[] args) {
        int [] ConjuntoNumeros = {1, 5, 23, 44, 89, 93, 100};
        System.out.println("El número mayor es el "+ numMayor(ConjuntoNumeros));
        /**
         * Ejercicio 2:
         * La notación big-O es quizás el método más rápido para poder averiguar el numero mayor dentro del array, pero
         * existirán clases que realizarán esta acción por nosotros.
         *
         * Ejercicio 3:
         * Como el código va observando uno por uno los números sí influirá en la velocidad de ejecución. El caso más
         * más favorable sería el encontrar el número al comienzo, mientras que el caso menos favorable sería al
         * encontrar el número al final.
         */
    }
    //Ejercicio 1
    public static int numMayor (int[] ConjuntoNumeros){
        int elMayor = 0;
        for (int i = 0; i < ConjuntoNumeros.length; i ++ ){
            if (ConjuntoNumeros[i] > elMayor){
                elMayor = ConjuntoNumeros[i];
            }
        }
        return elMayor;
    }
}
