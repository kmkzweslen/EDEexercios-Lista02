package ifma.lista02;

public class Q03 {
    public static void q03(int[][] matriz) {
        int n = matriz.length;
        System.out.print("Elementos da diagonal secundária: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][n - i - 1] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        q03(matriz);
    }
}
