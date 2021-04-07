package com.renanfonseca.estruturadados.fila;

public class FilaPrioridade<T> extends Fila<T> {
	
	public FilaPrioridade() {
		super();
	}
	
	public FilaPrioridade(int capacidade) {
		super(capacidade);
	}

	@Override
	public void enfileira(T elemento) {
			
			@SuppressWarnings("unchecked")
			Comparable<T> chave = (Comparable<T>) elemento;
			
			int i;
			for (i=0; i < this.tamanho; i++) {
				if(chave.compareTo(this.elementos[i]) < 0) {
					break;
				}
			}
			this.adiciona(i, elemento);

		}
}


