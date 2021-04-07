package com.renanfonseca.estruturadados.vetor;

import com.renanfonseca.estruturadados.base.EstruturaEstatica;

public class ListaRefactoring<T> extends EstruturaEstatica<T> {
	
	public ListaRefactoring() {
		super();
	}
	
	@Override
	public boolean adiciona(int posicao, T elemento) {
		return super.adiciona(posicao, elemento);
	}
	
	@Override
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}

}
