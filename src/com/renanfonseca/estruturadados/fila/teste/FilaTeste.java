package com.renanfonseca.estruturadados.fila.teste;

import com.renanfonseca.estruturadados.fila.Fila;

public class FilaTeste {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<Integer>();
		
		System.out.println(fila.espiar());
		System.out.println(fila.tamanho());
		System.out.println(fila.estaVazio());
		
		fila.enfileira(10);
		System.out.println(fila.estaVazio());
		System.out.println(fila.tamanho());
		System.out.println(fila);
		fila.enfileira(124);
		fila.enfileira(77);
		System.out.println(fila.espiar());
		
		
		System.out.println(fila);
		System.out.println(fila.desenfileira());
		System.out.println(fila);

	}

}
