package ejercicio4;
public class Desempleado extends Trabajador implements Formable{
	public void formar(int horas) {
		System.out.println("Desempleado recibe formación de  " + horas + " horas");
	}
}
