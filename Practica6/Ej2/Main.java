package Practica6.Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Hanoi = new Scanner(System.in);
        System.out.println("Numero de discos");
        int numDiscos = Hanoi.nextInt();
        Hanoi.close();
        moverDiscos(numDiscos, "a", "b", "c");

    }
    public static void moverDiscos(int i, String inicio, String fin, String comodin){
        if (i == 1){
            System.out.println("Se mueve un disco que parte desde " + inicio + " y llega hasta " + fin);
            return;
        }
        moverDiscos(i-1, inicio, fin, comodin);
        System.out.println("Muevo el disco " + i + " partiendo desde " + inicio + " y llegando a " + fin);
        moverDiscos(i-1,comodin,fin,inicio);
    }

}
