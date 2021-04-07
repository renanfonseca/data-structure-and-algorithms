package com.renanfonseca.estruturadados.pilha.teste;

import java.util.Stack;

public class PilhaJavaTeste {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.capacity());
		System.out.println(stack.isEmpty());
		System.out.println(stack.add(10));
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.add(112));
		System.out.println(stack.size());
		System.out.println(stack.push(5));
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
	}

}
