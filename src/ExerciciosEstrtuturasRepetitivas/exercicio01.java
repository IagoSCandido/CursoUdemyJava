package ExerciciosEstrtuturasRepetitivas;

import java.util.Scanner;

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int entradaSenha = sc.nextInt();

        while (entradaSenha != senha) {
            System.out.println("Senha Invalida");
            entradaSenha = sc.nextInt();

        }

        sc.close();

        System.out.println("Acesso Permitido");

    }
}
