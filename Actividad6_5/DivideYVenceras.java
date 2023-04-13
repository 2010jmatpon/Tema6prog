package Actividad6_5;

public class DivideYVenceras {
    public static void main(String[] args) {
        int[] array = {3, 5, 23, 44, 78, 79, 84};
        int buscar = 44;
        System.out.println("El numero "+ buscar + " está en la posición " + divideYVenceras(array,0, array.length, buscar));
    }

    public static int divideYVenceras (int[] array, int comienzo, int fin, int buscar){
        int mitad = (comienzo + fin)/2;
        if (array[mitad] == buscar){
            return mitad;
        } else if (array[mitad] > buscar){
            return divideYVenceras(array, mitad+1, fin, buscar);

        }else {
            return divideYVenceras(array, comienzo, mitad-1, buscar);
        }
    }
}
