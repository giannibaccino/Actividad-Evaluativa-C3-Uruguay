package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aula {
    int id;
    int capacity;
    String subject;
    Profesor profe;
    List<Estudiante> alumnos;
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
        if ((this.profe.status == false) || (this.cant < capacity / 2) || (this.profe.subject.equalsIgnoreCase(this.subject)))
            return false;
        else
            return true;
    }

    public List<Estudiante> crearAlumnos(int cant) {
        List<Estudiante> alumnos = new ArrayList<Estudiante>(cant);
        alumnos.add(new Estudiante("Pepe", 19, "Hombre"));
        alumnos.add(new Estudiante("Mateo", 21, "Hombre"));
        alumnos.add(new Estudiante("Jose", 18, "Hombre"));
        alumnos.add(new Estudiante("Martina", 22, "Mujer"));
        alumnos.add(new Estudiante("Manuela", 18, "Mujer"));

        return alumnos;
    }
}
