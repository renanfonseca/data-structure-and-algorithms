package com.renanfonseca.estruturadados.base;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;

	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}


	public EstruturaEstatica() {
		this(10);
	}
	

	protected boolean adiciona(T elemento) {	

		this.aumentaCapacidade();

		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		return false;	

	}

	protected boolean adiciona(int posicao, T elemento) {	

		if (posicao < 0 || posicao > tamanho){
			throw new IllegalArgumentException("Posi??o inv?lida");
		}

		this.aumentaCapacidade();

		for(int i=this.tamanho-1; i>= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;


	}
	
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi??o inv?lida");
		}
		
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
		
	}

	public int tamanho() {
		return this.tamanho;
	}

	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			@SuppressWarnings("unchecked")
			T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public boolean estaVazio() {
		return this.tamanho == 0;
	}

	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}


		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");

		return s.toString();
	}

}
