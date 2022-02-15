package com.deborah.curso.intermediario.java.aula75_84;

import java.util.StringTokenizer;

public class Aula84 {

	public static void main(String[] args) {

		
		String doArquivo = "1;Deborah;24;";

		StringTokenizer st = new StringTokenizer(doArquivo, ";");

		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}


	}

}
