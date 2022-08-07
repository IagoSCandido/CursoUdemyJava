package introducaoorientacaoobjetos.exercicios.exercicio03;

import introducaoorientacaoobjetos.exercicios.exercicio03.entities.Student;

import java.util.Locale;

// Fazer um programa para ler o nome de um aluno e as tres notas que ele obteve nos tres trimestres do ano.
//Ao final, mostrar qual a nota final do aluno no ano. Dizer tambem se esta aprovado (PASS) ou reprovado (FAILED) e, em caso negativo, quantos pontos falta.
//Aprovado será igual ou maior 60% da nota total que é igual a 100;
public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Student student = new Student();

//        student.name = "Alex Green";
//        student.quarterGrade1 = 27;
//        student.quarterGrade2 = 31;
//        student.quarterGrade3 = 32;
//        student.finalGrade();

        student.name = "Alexa Green";
        student.quarterGrade1 = 17;
        student.quarterGrade2 = 20;
        student.quarterGrade3 = 15;
        student.finalGrade();

        if (student.finalGrade() < 60.0) System.out.printf("FAILED %nMISSING %.2f POINTS%n", student.missingPoints());
        else System.out.println("PASS");

    }
}

