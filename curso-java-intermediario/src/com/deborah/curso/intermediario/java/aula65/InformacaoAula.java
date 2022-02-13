package com.deborah.curso.intermediario.java.aula65;


@interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "http://deborah.com";
	
	String site()default "http://deborahcaroline.com.br";
}
