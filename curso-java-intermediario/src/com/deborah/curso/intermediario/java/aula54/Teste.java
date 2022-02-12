package com.deborah.curso.intermediario.java.aula54;

public class Teste {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());

		
		Data data = new Data(31, 10, 2022, dia.SEGUNDA);
	}

}
