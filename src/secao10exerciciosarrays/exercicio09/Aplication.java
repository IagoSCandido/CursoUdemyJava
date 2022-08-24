package secao10exerciciosarrays.exercicio09;

public class Aplication {
    public static void main(String[] args) {
        int n = 5;
        String[] arrayNames = new String[] {"Joao", "Maria", "Teresa", "Carlos", "Paulo"};
        int[] arrayAges = new int[] {16, 21, 15, 23, 17};

        int olderPersonsAge = 0;
        String olderPersonsName = "";
        for (int i = 0; i < n ; i++) {
            if (olderPersonsAge < arrayAges[i]) {
                olderPersonsAge = arrayAges[i];
                olderPersonsName = arrayNames[i];
            }

        }
        System.out.println("Pessoa mais velha: " + olderPersonsName);
    }
}
