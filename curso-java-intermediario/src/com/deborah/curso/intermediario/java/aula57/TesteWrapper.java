package com.deborah.curso.intermediario.java.aula57;

public class TesteWrapper {

	public static void main(String[] args) {
		
		short num1 = 1;
		
		Short num2 = new Short((short) 1);
		Byte num3 = new Byte((byte) 10);
		Integer num4 = new Integer(100);
		Long num5 = new Long(5L);
		Float num6 = new Float(3.5F);
		Double num7 = new Double(2.555);
		Boolean num8 = new Boolean(true);
		
		Integer num9 = new Integer("2000");
		
		Double num10 = new Double("3.5");
		
		System.out.println(num9.intValue());
		
		System.out.println(num10.intValue());
		
		int num11 = Integer.parseInt("10000");
		
		double num12 = Double.parseDouble("3.566");
		System.out.println(num12);
		
		Integer num13 = Integer.valueOf(2000);
		System.out.println(num13);
		
		System.out.println(num4 == num9);
		
	}
	
	
	
	

}
