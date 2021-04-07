package com.renanfonseca.estruturadados.vetor.teste;

import com.renanfonseca.estruturadados.vetor.Lista;

public class TesteLista {

	public static void main(String[] args) {

		Lista<String> vetor = new Lista<String>(1);

		vetor.adiciona("Elemento");
		System.out.println(vetor);


		Lista<Contato> vetorContatos = new Lista<Contato>(1);

		Contato c1 = new Contato("Contato 1", "84 99110238", "gmail.com");


		vetorContatos.adiciona(c1);
		System.out.println(vetorContatos);

		Lista<String> lista = new Lista<String>();
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");

		System.out.println(lista);
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("L"));

		System.out.println(lista.ultimoIndice("A"));
		System.out.println(lista.ultimoIndice("B"));
		System.out.println(lista.ultimoIndice("C"));

		lista.remove("B");
		System.out.println(lista);

		System.out.println(lista.obtem(1));
		
		lista.limpar();
		System.out.println(lista);

	}

}
