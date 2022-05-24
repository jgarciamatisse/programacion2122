package _03ejerciciosinterfaces._01conjunto;

public interface Coleccion <T>{
	void agregar (T x);
	void eliminar (T x);
	boolean estaVacia();
	int talla();
	boolean contiene(T x);
}
