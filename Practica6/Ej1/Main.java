package Practica6.Ej1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            exception();
        } catch (excepcion a){
            System.out.println("Hay una excepcion: " + a.getMessage());
        } catch (IOException a){
            System.out.println("Hay una excepcion: " + a.getMessage());
        }
    }
    public static void exception() throws  excepcion, IOException{
        throw new excepcion("Hay una excepción");
    }
}
