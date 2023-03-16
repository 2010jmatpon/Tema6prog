package Recursividad.Actividad6_2;

public class Act6_2 {
    public static void main(String[] args) {
       int n = 5;
        System.out.println("Ejercicio 1");
        inverso(n);
        System.out.println("Ejercicio 2");
        System.out.println(sumaNaturales(n));
        System.out.println("Ejercicio 3");
        System.out.println(sucesionFibonacci(13));
        System.out.println("Ejercicio 4: Forma Iterativa");
        System.out.println(MCD(4,2));
        System.out.println("Ejercicio 4: Forma Recursiva");
        System.out.println(MaxComDiv(10,5));
    }
   /** EJEMPLO DE EXPLICACIÓN
    * public static void inverso (int n){
        if (n == 0){ //CASO BASE
            System.out.println("Caso Base");
        } else {  //CASO RECURSIVO
            System.out.println(n + "A la ida");
            inverso(n - 1);
            System.out.println(n + "A la vuelta");
        }
    }**/

   // Ejercicio 1.- Crea una función que imprima los números naturales en orden inverso comenzando por el
   //número n.
   public static void inverso (int n){
       if (n > 0){ //CASO RECURSIVO
           System.out.println(n);
           inverso(n-1);
       } //CASO BASE
   }

   //Ejercicio 2.- Calcula la suma de los primeros n números naturales utilizando recursividad

    public static int sumaNaturales (int n){

       if (n == 1){
           return 1;
       } else {
           return n + sumaNaturales(n-1);
       }

    }
//Ejercicio 3.-Realiza una función que calcule el n-ésimo término de la sucesión de Fibonacci.
    public static int sucesionFibonacci (int n){
       if (n == 0){
           return 0;
       }else if (n == 1){
           return 1;
       } else {
           return sucesionFibonacci(n-2) + sucesionFibonacci(n-1);
       }
    }
    //Ejercicio 4.-Crea un método que calcule el máximo común divisor (MCD) de dos números enteros
    //(utilizando la división euclídea).

    //FORMA ITERATIVA
    public static int MCD (int a, int b){
       int resultado = 0;
       do {
            resultado = b;
            b = a % b;
            a = resultado;
       } while (b != 0);
       return resultado;
    }

    //FORMA RECURSIVA
    public static int MaxComDiv (int a, int b){
       if (b == 0){
           return a;
       } else {
           return MaxComDiv(b, a % b);
       }
    }
}
