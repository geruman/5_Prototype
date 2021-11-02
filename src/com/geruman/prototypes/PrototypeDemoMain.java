package com.geruman.prototypes;

public class PrototypeDemoMain {

	public static void main(String[] args) {
		Oveja oveja = new Oveja();
		oveja.setNombre("Dolly");
		oveja.setColor("negro");
		oveja.setPelo("corto");
		System.out.println(oveja);
		try {
			Oveja clon = oveja.clone();
			System.out.println(clon);
			System.out.println(clon==oveja);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
