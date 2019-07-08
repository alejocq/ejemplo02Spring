package com.sopra.spring.ejemplo02spring.ej04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lanzador04 {
//	private static ApplicationContext context;
//	static {
//		context = new ClassPathXmlApplicationContext("ej04.xml");
//	}
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ej04.xml");
		System.out.println(context.getBean("bandejaDeCamarero"));
		System.out.println(context.getBean("mapaDecafes"));
		System.out.println(context.getBean("puesUnSet"));
	}
}
