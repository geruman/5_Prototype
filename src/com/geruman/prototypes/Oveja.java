package com.geruman.prototypes;

public class Oveja {
	private String nombre;
	private String color;
	private String pelo;
	public Oveja() {
		nombre="";
		color="";
		pelo="";
	}
	@Override
	public Oveja clone() throws CloneNotSupportedException {
		Oveja clon = new Oveja();
		clon.nombre = nombre;
		clon.color = color;
		clon.pelo = pelo;
		return clon;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPelo() {
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	@Override
	public String toString() {
		return nombre+" "+color+" "+pelo;
	}
	
}
