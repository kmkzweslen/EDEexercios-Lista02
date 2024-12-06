package ifma.lista02;

public class Q08{
    public static int q08(int[][] matriz) {
        int n = matriz.length;
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maior = q08(matriz);
        System.out.println("Maior valor abaixo da diagonal secundária: " + maior);
    }
}
