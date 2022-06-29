package ejercicio4;

import java.util.Random;

public class Estudiante extends Persona {
    int note;

    public Estudiante(String name, int age, String sex) {
        super(name, age, sex);
        Random random = new Random();
        int nota = random.nextInt(11);
        this.note = nota;
        falta(2);
    }

    public boolean getStatus(){
        return this.status;
    }

    public int getNote() {return this.note;}

    public String getSex() {
        return this.sex;
    }
}
