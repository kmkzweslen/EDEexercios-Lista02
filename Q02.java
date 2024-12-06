package ifma.lista02;

public class Q02 {
    public static void q02(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            matriz[i][n - i - 1] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
