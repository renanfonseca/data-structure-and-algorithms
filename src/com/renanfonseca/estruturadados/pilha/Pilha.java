package com.renanfonseca.estruturadados.pilha;

import com.renanfonseca.estruturadados.base.EstruturaEstatica;


public class Pilha<T> extends EstruturaEstatica<T> {
	
	public Pilha() {
		super(10);
	}
	
	public Pilha(int capacidade) {
		super(capacidade);
	}
	
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	public T topo() {
		
		if(this.estaVazio()) {
			return null;
		}
		
		return this.elementos[tamanho-1];
		
	}
	
	public T desempilha() {
		
		if(estaVazio()) {
			return null;
		}
		
		return this.elementos[--tamanho];
		
	}

}
