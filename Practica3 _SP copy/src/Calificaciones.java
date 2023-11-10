import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import files.Files;

public class Calificaciones {
    public static void main(String[] args) throws IOException {
        Files arch = new Files();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        int[] P1;
        int[] SP;
        int[] TP;
        int[] CP;

        System.out.println("nombre del archivo con las calificaciones del Parcial 1: ");
        filename = bufer.readLine();
        P1 = arch.archivoAint(filename);

        System.out.println("nombre del archivo con las calificaciones del Parcial 2: ");
        filename = bufer.readLine();
        SP = arch.archivoAint(filename);

        System.out.println("nombre del archivo con las calificaciones del Parcial 3: ");
        filename = bufer.readLine();
        TP = arch.archivoAint(filename);

        System.out.println("nombre del archivo con las calificaciones del Parcial 4: ");
        filename = bufer.readLine();
        CP = arch.archivoAint(filename);

        double[] promedios = new double[4];
        promedios[0] = calcularPromedio(P1);
        promedios[1] = calcularPromedio(SP);
        promedios[2] = calcularPromedio(TP);
        promedios[3] = calcularPromedio(CP);

        System.out.println("Escribe el nombre con el que deseas guardar los promedios por parcial : ");
        filename = bufer.readLine();
        arch.arregloArchivo(filename, promedios);

        double[] promediosIndividuales = new double[P1.length];
        for (int i = 0; i < P1.length; i++) {
            int[] calificacionesIndividuales = { P1[i], SP[i], TP[i], CP[i] };
            promediosIndividuales[i] = calcularPromedioIndividual(calificacionesIndividuales);
        }
        System.out.println("nombre del archivo para guardar los promedios individuales: ");
        filename = bufer.readLine();
        arch.arregloArchivo(filename, promediosIndividuales);

        double promedioGeneral = 0;
        for (double promedio : promediosIndividuales) {
            promedioGeneral += promedio;
        }
        promedioGeneral /= promediosIndividuales.length;

        System.out.println("Promedio general del grupo: " + promedioGeneral);
    }

    public static double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    public static double calcularPromedioIndividual(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / 4;
    }
}