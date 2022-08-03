package ExerciciosEstrtuturasRepetitivas;
// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.
public class exercicio10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int pow2 =(int) Math.pow(i, 2);
            int pow3 =(int) Math.pow(i, 3);

            System.out.printf("%d %d %d%n",i, pow2, pow3);
        }
    }
}
