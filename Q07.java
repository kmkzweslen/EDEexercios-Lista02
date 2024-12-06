package ifma.lista02;

public class Q07{
    public static void q07(int[][] matriz) {
        int n = matriz.length;
        System.out.print("Elementos abaixo da diagonal secundária: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
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

        q07(matriz);
    }
}
