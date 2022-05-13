package ejercicio4;

public class DarFormacion {
    public static void main(String[] args) {
        Persona v[] = {
            new Desempleado(),
            new EstudianteCCFF(),
            new EstudianteCCFF(),
            new EstudianteCCFF(),
            new Desempleado(),
            new Desempleado(),
            new EstudianteCCFF(),
            new Desempleado(),
            new Desempleado(),
            new EstudianteCCFF()
        };
        
        for(int i = 0; i < v.length; i++) {
        	((Formable)v[i]).formar(100);
        }
    }
}
