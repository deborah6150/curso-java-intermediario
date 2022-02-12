package com.deborah.curso.intermediario.java.aula53;


public class Teste {

	public static void main(String[] args) {

		usandoConstante();
		System.out.println();
		usandoEnum();
	}
	
	private static void usandoConstante() {
		
		int domingo = DiaSemanaConstantes.DOMINGO;
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		
		System.out.println("Teste utilizando constante no java");
		imprimeDiaSemana(domingo);
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
	}

	private static void imprimeDiaSemana(int dia) {

		switch (dia) {
		case 1: {

			System.out.println("Domingo");
			break;
		}
		case 2: {

			System.out.println("Segunda-feira");
			break;
		}
		case 3: {

			System.out.println("Terca-feira");
			break;
		}
		case 4: {

			System.out.println("Quarta-feira");
			break;
		}
		case 5: {

			System.out.println("Quinta-feira");
			break;
		}
		case 6: {

			System.out.println("Sexta-feira");
			break;
		}
		case 7: {

			System.out.println("Sabado");
			break;
		}

		
		}
	}
	private static void usandoEnum() {
		
		DiaSemana domingo = DiaSemana.DOMINGO;
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		
		System.out.println("Teste utilizando Enum no java");
		imprimeDiaSemana(domingo);
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
	}
	
	private static void imprimeDiaSemana(DiaSemana dia) {

		switch (dia) {
		case DOMINGO: {

			System.out.println("Domingo");
			break;
		}
		case SEGUNDA: {

			System.out.println("Segunda-feira");
			break;
		}
		case TERCA: {

			System.out.println("Terca-feira");
			break;
		}
		case QUARTA: {

			System.out.println("Quarta-feira");
			break;
		}
		case QUINTA: {

			System.out.println("Quinta-feira");
			break;
		}
		case SEXTA: {

			System.out.println("Sexta-feira");
			break;
		}
		case SABADO: {

			System.out.println("Sabado");
			break;
		}

		
		}
	}
}

