package poo.exercises.exercise3.entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalNota() {
        return nota1 + nota2 + nota3;
    }

    public double missingPoints(){
        if (finalNota() < 60.0){
            return 60.0 - finalNota();
        } else return 0.0;
    }
}
