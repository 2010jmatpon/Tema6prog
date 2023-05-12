package Practica6;

public class Hanoi {
    public static void main(String[] args) {
        int n = 3;
        Hanoi(n, "A", "B", "C");
    }
    public static void Hanoi(int n,String origen, String auxiliar, String destino){
        if (n>0){
            Hanoi(n-1, origen, destino, auxiliar);
            System.out.println("Mover disco " + n + " desde " + origen + " hasta " + destino);
            Hanoi(n-1, auxiliar, origen, destino);
        }
    }
}
