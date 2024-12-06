package ifma.lista02;

public class Q06 {
    public static double q06(int[][] matriz) {
        int n = matriz.length;
        int soma = 0;
        int contagem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                soma += matriz[i][j];
                contagem++;
            }
        }
        return (double) soma / contagem;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double media = q06(matriz);
        System.out.println("Média dos elementos da diagonal secundária e abaixo: " + media);
    }
}
