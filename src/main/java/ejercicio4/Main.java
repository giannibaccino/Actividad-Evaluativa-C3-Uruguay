package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Aula aula = new Aula(124, 5);
        if(aula.seDa()){
            System.out.println("La clase se da");
            aula.aprobados();
        }
        else
            System.out.println("La clase no se da");
    }
}
