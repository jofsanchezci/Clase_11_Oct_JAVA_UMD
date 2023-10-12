public class CreacionClase {
    public static void main(String[] args) {
        
        Asignatura asignatura1 = new Asignatura("JAVA", "NPR564", 2);
        Asignatura asignatura2 = new Asignatura("Python", "NPR565", 3);
        Asignatura asignatura3 = new Asignatura("Redes", "NPR567", 4);
        asignatura2.setCodigo("NPRF4");
        asignatura1.setCurso(5);
        
        System.out.println("La primera asignatura es " + asignatura1.getNombre() + " con código " + asignatura1.getCodigo());
        System.out.println("La segunda asignatura es " + asignatura2.getNombre() + " del curso " + asignatura2.getCurso());
        System.out.println("La Tercera asignatura es " + asignatura3.getNombre() + " con código " + asignatura3.getCodigo());
    }
    
}