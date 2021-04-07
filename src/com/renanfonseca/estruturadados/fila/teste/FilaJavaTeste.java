package com.renanfonseca.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class FilaJavaTeste {
	
	public static void main(String[] args) {
		
		Queue<Integer> filaJava = new LinkedList<Integer>();
		
		filaJava.add(13);
		filaJava.add(23);
		System.out.println(filaJava.peek());
		System.out.println(filaJava);
		filaJava.remove();
		System.out.println(filaJava);
		
	}

}
