package com.deborah.curso.intermediario.java.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		Short num2 = 1;
		Byte num3 = 10;
		Integer num4 = 100;
		Long num5 = 5L;
		Float num6 = 3.5F;
		Double num7 = 2.555;
		Boolean num8 = true;
		
		//auto un-boxing
		int num9 = num4; //num4.intValue;

		num4++;
		
		System.out.println(num4);
	}

}
