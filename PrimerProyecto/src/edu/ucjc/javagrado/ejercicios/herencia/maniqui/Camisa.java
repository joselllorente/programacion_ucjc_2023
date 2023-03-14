package edu.ucjc.javagrado.ejercicios.herencia.maniqui;

public class Camisa extends Ropa{

	private Boton[] botones;
	
	public Camisa(String color, String talla, double precio) {
		super(color, talla, precio);
	}
	
	public Camisa(String color, String talla, double precio, Boton[] botones) {
		super(color, talla, precio);
		this.botones = botones;
	}

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}

}
