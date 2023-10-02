import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad del arreglo: ");
        int canti = sc.nextInt();
        
        int[] arreglo = new int[canti];
        
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < canti; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }
        
        int maximo = arreglo[0];
        int minimo = arreglo[0];
        int impares = 0;
        int pares = 0;
        
        for (int i = 0; i < canti; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
            
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
            
            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Cantidad de valores impares: " + impares);
        System.out.println("Cantidad de valores pares: " + pares);
        
        sc.close();
    }
}
