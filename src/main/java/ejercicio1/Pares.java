package ejercicio1;

import java.util.Scanner;

public class Pares {
    int n;
    boolean es;

    public Pares (int n){
        this.n = n;
        if((n % 2) == 0)
            this.es = true;
        else
            this.es = false;
    }

    public static void main(String[] args) {
        System.out.println("Inserte un numero entero para verificar si es par:");
        Scanner leer = new Scanner(System.in);
        Pares par = new Pares(leer.nextInt());
        if (par.es)
            System.out.println(par.n + " es par");
        else
            System.out.println(par.n + " no es par");
    }
}
