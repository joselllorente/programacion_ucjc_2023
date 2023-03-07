package edu.ucjc.javagrado.ejercicios.carreracaballos;

public class Hipodromo {

	public static void main(String[] args) {
		Caballo caballo1 = new Caballo("Pitufo",1,40,300,12);
		Caballo caballo2 = new Caballo("Tanos",2,60,250,15);
		Caballo caballo3 = new Caballo("Caballo1",3,70,340,16);
		
		Carrera carrera = new Carrera ("Grand Prix",1000);
		
		Caballo [] cajon = new Caballo[3];
		cajon[0]= caballo1;
		cajon[1]= caballo2;
		cajon[2]= caballo3;

		carrera.setCajon(cajon);
				
		carrera.iniciarCarrera();

	}

}
