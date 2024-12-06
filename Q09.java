package ifma.lista02;

public class Q09 {
    public static void q09(int[][] matriz) {
        int n = matriz.length;
        System.out.print("Elementos da diagonal secundária e acima: ");
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        q09(matriz);
    }
}
