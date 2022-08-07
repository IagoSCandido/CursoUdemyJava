package introducaoorientacaoobjetos.exercicios.exercicio03.entities;

public class Student {
    public String name;
    public double quarterGrade1;
    public double quarterGrade2;
    public double quarterGrade3;

    public double finalGrade () {
        return quarterGrade1 + quarterGrade2 + quarterGrade3;
    }

    public double missingPoints () {
        if (finalGrade() < 60.0) return 60.0 - finalGrade();
        else return 0.0;
    }
}
