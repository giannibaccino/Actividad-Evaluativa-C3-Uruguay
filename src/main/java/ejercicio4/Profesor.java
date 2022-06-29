package ejercicio4;

import java.util.Random;

public class Profesor extends Persona {
    String subject;

    public Profesor(String name, int age, String sex) {
        super(name, age, sex);
        Random random = new Random();
        int subject = random.nextInt(3);
        switch(subject){
            case 0:
                this.subject = "Matematicas";
                break;
            case 1:
                this.subject = "Filosofia";
                break;
            case 2:
                this.subject = "Fisica";
                break;
        }
        falta(5);
    }
}
