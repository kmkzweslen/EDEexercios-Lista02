package ifma.lista02;

public class Q04 {
    public static int q04(int[][] matriz) {
        int n = matriz.length;
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += matriz[i][n - i - 1];
        }
        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = q04(matriz);
        System.out.println("Soma dos elementos da diagonal secundária: " + soma);
    }
}
