package com.sopra.spring.ejemplo02spring.ej01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LanzadorConSpring {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("ej01.xml");
	
	public static void main(String[] args) {
		
		BarDeCopas elBuzon = context.getBean("elBuzon", BarDeCopas.class);
		//Object bean =  context.getBean("elBuzon"); No sabe que tipo de objeto es, usar el de arriba.
		System.out.println(elBuzon);
		elBuzon.setCalidadDeLaBebida("Esto no mejora");
		cambiaMiCalidad();
		System.out.println(elBuzon);
	}
	private static void cambiaMiCalidad() {
		BarDeCopas elBuzon = context.getBean("elBuzon", BarDeCopas.class);
		System.out.println(elBuzon);
		elBuzon.setCalidadDeLaBebida("Infame");
	}
}
