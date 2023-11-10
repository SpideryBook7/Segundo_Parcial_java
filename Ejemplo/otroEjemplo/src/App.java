public class App {
    public static void main(String[] args) {
        estudiante[] grupo4c = new estudiante[2];
        estudiante miguel = new estudiante();
        miguel.setNombre("miguel");
        miguel.setCarrera("TIADSM");
        miguel.setCuatrimestre(4);
        miguel.setGrupo('C');
        miguel.setPromedio(3.5);
        grupo4c[0] = miguel;
        estudiante eslenderman = new estudiante();
        eslenderman.setNombre("eslender");
        eslenderman.setCarrera("TIADSM");
        eslenderman.setCuatrimestre(4);
        eslenderman.setGrupo('C');
        eslenderman.setPromedio(7.6);
        grupo4c[1] = eslenderman;
        for (estudiante unEstudiante: grupo4c){
            System.out.println(unEstudiante.getNombre() + " - " + unEstudiante.getPromedio());
        }
    }
}
