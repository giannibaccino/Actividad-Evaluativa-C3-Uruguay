package ejercicio4;

import java.util.Random;

public class Persona {
    String name;
    int age;
    String sex;
    boolean status;

    public Persona(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void falta(int tope) {
        Random random = new Random();
        int rvalue = random.nextInt(tope);
        if (rvalue == 0)
            this.status = false;
        else
            this.status = true;
    }
}

