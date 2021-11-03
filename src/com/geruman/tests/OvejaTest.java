package com.geruman.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.geruman.prototypes.Oveja;

class OvejaTest {

	@Test
	void test() {
		Oveja oveja = new Oveja();
		oveja.setNombre("Dolly");
		oveja.setColor("blanco");
		oveja.setPelo("mucho");
		Oveja ovejaClon;
		try {
			ovejaClon = oveja.clone();
			assert oveja.getNombre()== ovejaClon.getNombre();
			assert oveja.getColor() == ovejaClon.getColor();
			assert oveja.getPelo() == oveja.getPelo();
			assertNotEquals(oveja, ovejaClon);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
