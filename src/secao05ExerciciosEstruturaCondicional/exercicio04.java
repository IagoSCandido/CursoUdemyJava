package secao05ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        Scanner sc = new Scanner(System.in);

        int horaInicio, horaTermino, duracao;

        System.out.println("Insira a hora inicial e final do jogo:");

        horaInicio = sc.nextInt();
        horaTermino = sc.nextInt();

        sc.close();

        if (horaInicio < horaTermino) duracao = horaInicio - horaTermino;
        else duracao = 24 - horaInicio - horaTermino;

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
    }
}

