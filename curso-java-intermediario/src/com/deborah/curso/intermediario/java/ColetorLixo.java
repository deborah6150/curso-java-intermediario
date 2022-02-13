package com.deborah.curso.intermediario.java;

import com.deborah.curso.intermediario.java.aula61.Contato;

public class ColetorLixo {

	public static void obterMemoriaUsada() {
		
		final int MB = 1024 * 1024;
		
		Runtime runTime = Runtime.getRuntime();
		
		System.out.println((runTime.totalMemory() - runTime.freeMemory())/MB);
	}
	
	
	public static void main(String[] args) {
		
		
		Contato[] contatos = new Contato[100000];
		
		Contato contato;
		
		for(int i=0; i< contatos.length; i++) {
			contato = new Contato("Contato"+i, "1234-4321"+i, "contato"+i+"@gmail.com");
			contatos[i] = contato;
		}
		
		System.out.println("Contatos criados");
		
		obterMemoriaUsada();
		
		contatos = null;
		
		Runtime.getRuntime().gc();

		
		System.out.println("Contatos removidos da memoria");
		
		obterMemoriaUsada();
	}

}
