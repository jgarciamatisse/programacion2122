package _03ejercicios._01gestionempleados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Empresa {
	//Atributos
	private String nombre;
	private ArrayList<Empleado> plantilla;

	//Constructor
	public Empresa (String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}

	//Numero de empleados
	public int getNumeroEmpleados() {
		return this.plantilla.size();
	}

	//nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//plantilla
	public ArrayList<Empleado> getPlantilla(){
		return plantilla;
	}
	
	//Contratar un empleado
	/**
	 * Añade un empleado a la plantilla de la empresa.
	 * @param e el empleado contratado
	 * @throws IllegalArgumentException si el empleado ya estaba en la empresa
	 */
	public void contratar(Empleado e) throws IllegalArgumentException {
		
		if(plantilla.contains(e)) {
			throw new IllegalArgumentException("No se puede contratar a alguien que ya esta contratado");
		} else {
			plantilla.add(e);
		}
	}
	
	//Despedir a un empleado
	public void despedir(Empleado e) throws NoSuchElementException {
//		if(plantilla.contains(e)) {
//			plantilla.remove(e);
//		} else {
//			throw new NoSuchElementException("No se puede despedir a alguien que no está contratado" );
//		}
		//Esta forma es más eficiente
		if(!plantilla.remove(e)) {
			throw new NoSuchElementException("No se puede despedir a alguien que no está contratado" );
		}
	}
	public void despedir(String dni) throws NoSuchElementException {
		Empleado e = new Empleado("",dni,0,0);
		if(!plantilla.remove(e)) {
			throw new NoSuchElementException("No se puede despedir a alguien que no está contratado" );
		}
	}
	public void despedir2(String dni) throws NoSuchElementException {
		boolean borrado = false;
		Iterator<Empleado> it = plantilla.iterator();
		while(it.hasNext() && !borrado) {
			Empleado e = it.next();
			if(e.getDni().equals(dni)) {
				it.remove();
				borrado = true;
			}
		}
	}
	
	
}
