package _02ejemplos._09DosTiposGenericos;

public class Pareja <T1,T2> {
	private T1 miembro1;
	private T2 miembro2;
	
	public Pareja(T1 miembro1, T2 miembro2) {
		this.miembro1 = miembro1;
		this.miembro2 = miembro2;
	}
	
	public String toString() {
		return "("+ miembro1 + ", " + miembro2 + ")"; 
	}
}
