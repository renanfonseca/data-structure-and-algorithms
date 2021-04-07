package com.renanfonseca.estruturadados.vetor.teste;

import com.renanfonseca.estruturadados.vetor.VetorObjetos;

public class TesteVetorObjetos {
	
	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "84 99110238", "gmail.com");
		Contato c2 = new Contato("Contato 2", "74 654132165", "hotmail.com");
		Contato c3 = new Contato("Contato 3", "64 545466", "youmail.com");
		
		
		Contato c4 = new Contato("Contato 1", "84 99110238", "gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if(pos >-1) {
			System.out.println("Existe");
		}else {
			System.out.println("Não Existe");
		}
		
		System.out.println(vetor);
		
		
		
	}

}
