package Actividad6_1;

public class Main {
    public static void main(String[] args) {
//1. ¿Cuál es el nombre en Java de la clase que define las excepciones, y de la que debe heredar cualquier clase
// que queramos usar para representar una excepción?
        //Exceptionthrowable".

//2. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al invocar un
// método de un objeto cuyo valor es “null”?
        //NullPointerException.

//3. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al obtener un
// comportamiento anómalo en la entrada / salida de información?
        //IOException.

//4. Observa el siguiente fragmento de código:
// ¿Qué excepción se produciría en el mismo?
        //NullPointerException, puesto que al array no se le añade ningún valor, así que sería nulo

//5. Observa el siguiente fragmento de código:
//¿Qué sucedería al ejecutar el mismo?
        // NumberFormatException

//6. Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente acción:

        String cadena = "Khvicha Kvaratskhelia, Yevhen Konoplyanka y Ricky Van Wolfswinkel";
        int NumEntero = 77;

        try{
            char caracter = caracterEn(cadena, NumEntero);
            System.out.println("El caracter de la posición introducida es " + "'" + caracter + "'");
        } catch (Exception excepcion) {
            excepcion.printStackTrace();
            System.out.println(excepcion.getMessage());
        }

    }
    public static char caracterEn (String cadena, int NumEntero) throws IllegalArgumentException{
        if (NumEntero >= 0 && NumEntero < cadena.length()){
            return cadena.charAt(NumEntero);
        } else if (NumEntero < 0){
            throw new IllegalArgumentException("El numero entero es mas pequeño que la cadena");
        } else{
            throw new IllegalArgumentException("El numero entero es más grande que la cadena");
        }

    }
}