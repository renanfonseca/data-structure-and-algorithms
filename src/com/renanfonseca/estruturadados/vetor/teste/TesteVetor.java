package com.renanfonseca.estruturadados.vetor.teste;

import com.renanfonseca.estruturadados.vetor.Vetor;

public class TesteVetor {
	
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(1);
		
			vetor.adiciona("Elemento 1");
			vetor.adiciona("Elemento 2");
			
			System.out.println(vetor.tamanho());
			
			System.out.println(vetor);
			
			System.out.println(vetor.busca(1));
			
			System.out.println(vetor.busca("Elemento 1"));
			System.out.println(vetor.busca("Elemento 6"));
			
			vetor.adiciona(0, "Adicionando");
			vetor.adiciona(2, "F");
			
			System.out.println(vetor);
			
			vetor.adiciona("Elemento 3");
			vetor.adiciona("Elemento 4");
			vetor.adiciona("Elemento 5");
			vetor.adiciona("Elemento 6");
			
			System.out.println(vetor);
			
			vetor.remove(1);
			System.out.println(vetor);
			
			vetor.remove(5);
			System.out.println(vetor);
		
		
	}
}