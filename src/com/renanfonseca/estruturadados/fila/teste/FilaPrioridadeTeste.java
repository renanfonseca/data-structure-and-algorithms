package com.renanfonseca.estruturadados.fila.teste;

import com.renanfonseca.estruturadados.fila.FilaPrioridade;

public class FilaPrioridadeTeste {
	
	public static void main(String[] args) {
		
		FilaPrioridade<Integer> filaPrioridade = new FilaPrioridade<>(23);
		
		
		System.out.println(filaPrioridade.estaVazio());
		System.out.println(filaPrioridade.tamanho());
		System.out.println("-------");
		filaPrioridade.enfileira(3);
		filaPrioridade.enfileira(6);
		filaPrioridade.enfileira(1);
		filaPrioridade.enfileira(3);
		filaPrioridade.enfileira(6);
		filaPrioridade.enfileira(2);
		
		System.out.println(filaPrioridade);
		
		
	}

}
