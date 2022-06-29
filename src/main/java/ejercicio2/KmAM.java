package ejercicio2;

import java.util.Scanner;

public class KmAM {
    double miles;
    double kms;

    public KmAM (){
        this.miles = 0;
        this.kms = 0;
    }

    public void millas(double miles){
        this.miles = miles;
        this.kms = miles * 1.6093;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        KmAM conv = new KmAM();
        while (true) {
            System.out.println("Introduzca la cantidad de Millas que quiere convertir a Km:");
            conv.millas(leer.nextDouble());
            if(conv.miles == 0) {
                System.out.println("Exit");
                break;
            }
            System.out.printf("%.2f", conv.miles);
            System.out.printf(" Millas son: %.2f", conv.kms);
            System.out.println(" Km");
        }
    }
}
