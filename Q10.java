package ifma.lista02;

public class Q10 {
    public static int q10(int[][] matriz) {
        int n = matriz.length;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int menor = q10(matriz);
        System.out.println("Menor valor da diagonal secundária e acima: " + menor);
    }
}
