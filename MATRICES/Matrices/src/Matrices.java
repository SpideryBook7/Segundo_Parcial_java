import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Pedir los valores de r1, c1, r2 y c2
        System.out.println("Introduce el valor de r1:");
        int r1 = scanner.nextInt();
        System.out.println("Introduce el valor de c1:");
        int c1 = scanner.nextInt();
        System.out.println("Introduce el valor de r2:");
        int r2 = scanner.nextInt();
        System.out.println("Introduce el valor de c2:");
        int c2 = scanner.nextInt();

        // Comprobar si c1 es diferente a r2
        if (c1 != r2) {
            System.out.println("No se puede continuar porque c1 es diferente a r2.");
            return;
        }

        // Leer los valores de a y b
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Introduce el valor de a[" + i + "][" + j + "]:");
                a[i][j] = scanner.nextInt();
            }
        }

        int[][] b = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println("Introduce el valor de b[" + i + "][" + j + "]:");
                b[i][j] = scanner.nextInt();
            }
        }

        // Multiplicar a y b
        int[][] c = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
}