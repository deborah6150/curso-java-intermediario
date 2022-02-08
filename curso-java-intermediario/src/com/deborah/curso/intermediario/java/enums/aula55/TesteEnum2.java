package com.deborah.curso.intermediario.java.enums.aula55;

import com.deborah.curso.intermediario.java.enums.aula54.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		System.out.println(dia);
		
	}

}
