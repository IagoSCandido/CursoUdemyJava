package exerciciosarrays.exercicio10;

import exerciciosarrays.exercicio10.entities.Student;

import java.util.Locale;
import java.util.Scanner;
//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).
public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 4;


//        instancia da classe Student como array.
        Student[] student = new Student[n];
        String name;
        double firsSemesterGrade, secondSemesterGrade;
        for (int i = 0; i < student.length; i++) {
            System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "o aluno");
            name = sc.next();
            firsSemesterGrade = sc.nextDouble();
            secondSemesterGrade = sc.nextDouble();
            student[i] = new Student(name, firsSemesterGrade, secondSemesterGrade);
        }
//        Verificacao de alunos aprovados.
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < student.length; i++) {
            if (student[i].isApppoved()) System.out.println(student[i].getName());

        }


        sc.close();

    }
}
