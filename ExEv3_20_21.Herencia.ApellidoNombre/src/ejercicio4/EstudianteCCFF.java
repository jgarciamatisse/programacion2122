package ejercicio4;
public class EstudianteCCFF extends Estudiante implements Formable{
	public void formar(int horas)  {
		System.out.println("Estudiante de CCFF recibe formación de  " + horas + " horas");
	}
}
