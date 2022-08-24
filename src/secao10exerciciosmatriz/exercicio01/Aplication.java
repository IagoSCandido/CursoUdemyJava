package secao10exerciciosmatriz.exercicio01;

public class Aplication {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {10, 8, 15, 12},
                {21, 11, 23, 8},
                {14, 5, 13, 19}
        };
        int locale = 8;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == locale) {
                    System.out.printf("Position %d, %d%n", i, j);
                    if (j > 0)
                        System.out.printf("Left: %d%n", matrix[i][j - 1]);
                    if (i > 0)
                        System.out.printf("Up: %d%n", matrix[i - 1][j]);
                    if (j < matrix[i].length - 1)
                        System.out.printf("Right: %d%n", matrix[i][j + 1]);
                    if (i < matrix.length - 1)
                        System.out.printf("Down: %d%n", matrix[i + 1][j]);
                }
            }
        }
    }
}