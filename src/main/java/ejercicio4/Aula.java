package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aula {
    int id;
    int capacity;
    String subject;
    Profesor profe;
    Estudiante alumnos[];
    int cant;

    public Aula(int id, int cant) {
        Random random = new Random();
        int subject = random.nextInt(3);
        switch (subject) {
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
        this.id = id;
        this.capacity = 6;
        this.profe = new Profesor("Eduardo", 45, "Hombre");
        this.alumnos = crearAlumnos(cant);
        this.cant = cant;
    }

    public boolean seDa(){
        if ((this.cant < capacity / 2) || (this.profe.status == false) || (this.profe.subject.equalsIgnoreCase(this.subject)) || presentes() )
            return false;
        else
            return true;
    }

    public Estudiante[] crearAlumnos(int cant) {
        Estudiante[] alumnos = new Estudiante[cant];
        alumnos[0] = (new Estudiante("Pepe", 19, "Hombre"));
        alumnos[1] = (new Estudiante("Mateo", 21, "Hombre"));
        alumnos[2] = (new Estudiante("Jose", 18, "Hombre"));
        alumnos[3] = (new Estudiante("Martina", 22, "Mujer"));
        alumnos[4] = (new Estudiante("Manuela", 18, "Mujer"));

        return alumnos;
    }

    public boolean presentes(){
        int f = 0;
        int t = 0;
        for(int i = 0; i < cant; i++){
            if(alumnos[i].getStatus() == true)
                t++;
            else
                f++;
        }
        if(t >= this.capacity/2)
            return true;
        else
            return false;
    }

    public void aprobados(){
        int ha = 0;
        int ma = 0;
        for(int i = 0; i < this.cant; i++){
            if(this.alumnos[i].getStatus() == true){
                if(this.alumnos[i].getNote() >= 5){
                    if(this.alumnos[i].getSex().equals("Hombre")){
                        ha++;
                    }
                    else
                        ma++;
                }
            }
        }
        System.out.println("Hombres aprobados: " + ha);
        System.out.println("Mujeres aprobados: " + ma);
    }

}
