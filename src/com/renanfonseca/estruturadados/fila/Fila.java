package com.renanfonseca.estruturadados.fila;

import com.renanfonseca.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}

	public void enfileira(T elemento) {
		this.adiciona(elemento);
	}

	public T espiar() {

		if(this.estaVazio()) {
			return null;
		}

		return this.elementos[0];
	}

	public T desenfileira() {

		if(this.estaVazio()) {
			return null;
		}

		T elementoRemovido = this.elementos[0];
		this.remove(0);

		return elementoRemovido;
	}

}
