package com.renanfonseca.estruturadados.pilha.teste;

import com.renanfonseca.estruturadados.pilha.Pilha;

public class PilhaTeste {

	public static void main(String[] args) {
	
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		System.out.println(pilha.estaVazio());
		
		for(int i=1; i<=12; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		System.out.println(pilha.estaVazio());
		
		System.out.println(pilha.topo());
		System.out.println(pilha.desempilha());
		System.out.println(pilha);

	}

}
