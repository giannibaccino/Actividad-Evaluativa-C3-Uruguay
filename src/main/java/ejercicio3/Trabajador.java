package ejercicio3;

import javax.swing.*;
import java.util.Scanner;

public class Trabajador {
    double base;
    double bonus;
    double total;
    String area;
    int hijos;

    public Trabajador(double base, String area, int hijos){
        this.base = base;

        this.hijos = hijos;
        int bh = 0;
        if(this.hijos > 2)
            bh = 150 * this.hijos;

        this.area = area;
        switch (this.area.toLowerCase()){
            case "sistemas":
                this.bonus = 1.25;
                break;
            case "contabilidad":
                this.bonus = 1.20;
                break;
            default:
                this.bonus = 1.10;
        };
        this.total = (this.base * this.bonus) + bh;
    }
    public void totalAPagar(){
        System.out.println("El total a pagar es: " + this.total);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su area de trabajo:");
        String area = leer.nextLine();
        System.out.println("Ingrese cantidad de hijos:");
        int hijos = leer.nextInt();
        Trabajador user = new Trabajador(20000, area, hijos);
        user.totalAPagar();
    }
}
