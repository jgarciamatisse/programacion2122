package _02ejemplos._07clasesgenericas;

import java.util.ArrayList;

public class TestEquipos {
	public static void main(String[] args) {
		EquipoFutbol ef = new EquipoFutbol("1ºDam");
		ef.fichar(new Futbolista(1,"Javi"));
		//ef.fichar(new Programador("111111A","Luis","Java"));
		System.out.println(ef.getCapitan().getGoles());
		
		EquipoProgramame ep = new EquipoProgramame("Sin java no hay paraiso");
		ep.fichar(new Programador("111111A","Luis","Java"));
		System.out.println(ep.getCapitan().getLenguaje());
		
		
		//El problema del equipo de objetos es que admite cualquier objeto
		EquipoObjetos eo = new EquipoObjetos("2º Dam");
		eo.fichar(new Programador("111111A","Luis","Java"));
		//eo.fichar(new Futbolista(1,"Javi"));
		//eo.getCapitan().getGoles(); Object no tiene getGoles();
		
		//La siguiente instruccion compila pero da error de ejecucion
		try {
			System.out.println(((Futbolista) eo.getCapitan()).getGoles());
		} catch (Exception e) {
			System.out.println("ERROR DE EJECUCION");
		}
		
		//Lista de Strings
		int luis = 20;
		ArrayList nombres = new ArrayList();
		nombres.add("javi");
		nombres.add("roberto");
		nombres.add(luis); // <---- Instruccion con error (se ha olvidado las comillas)
		//Mostrar los nombres en mayusculas
		for(int i = 0; i < nombres.size(); i++) {
			System.out.println(((String)(nombres.get(i))).toUpperCase());
		}
		
		//Con la sintaxis de genericidad (notacion de diamante) 
		//el mismo error se detectaría al compilar
		ArrayList<String> nombres2 = new ArrayList<>();
		nombres2.add("javi");
		nombres2.add("roberto");
		
		//La siguiente instruccion ahora no compila
		//nombres2.add(luis);
		
		//Equipo
		Equipo<Futbolista> efutbol = new Equipo<>("1º DAM");
		efutbol.fichar(new Futbolista(1,"Javi"));
		//efutbol.fichar("pepe");
		//efutbol.fichar(new Programador("1111","carlos","c"));
		
		Equipo<Programador> eProgramame = new Equipo<>("1º DAM");
		eProgramame.fichar(new Programador("1111","carlos","c"));
		
		
		
	}

}
