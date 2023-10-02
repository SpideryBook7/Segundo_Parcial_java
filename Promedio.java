import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de grupos a evaluar: ");
        int numGrupos = scanner.nextInt();

        double[] promediosGrupos = new double[numGrupos];

        for (int i = 0; i < numGrupos; i++) {
            System.out.print("Ingrese la cantidad de alumnos en el grupo " + (i + 1) + ": ");
            int numAlumnos = scanner.nextInt();

            double[] promediosAlumnos = new double[numAlumnos];

            for (int j = 0; j < numAlumnos; j++) {
                System.out.print("Ingrese el promedio del alumno " + (j + 1) + " en el grupo " + (i + 1) + ": ");
                promediosAlumnos[j] = scanner.nextDouble();
            }

            double promedioGrupo = calcularPromedio(promediosAlumnos);
            promediosGrupos[i] = promedioGrupo;

            System.out.println("Promedio del grupo " + (i + 1) + ": " + promedioGrupo);
        }

        double promedioGeneral = calcularPromedio(promediosGrupos);

        System.out.println("Promedio general de la carrera TICS: " + promedioGeneral);
    }

    public static double calcularPromedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
}
