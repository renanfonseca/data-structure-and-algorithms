package com.renanfonseca.estruturadados.vetor.teste;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		
		System.out.println(arrayList);
		
		arrayList.add(1, "H");
		System.out.println(arrayList);
		
		
		boolean existe = arrayList.contains("A");
		if(existe) {
			System.out.println("Existe no array");
		}else {
			System.out.println("Não Existe no array");
		}
		
		int pos = arrayList.indexOf("C");
		if(pos > -1) {
			System.out.println("Existe no array " + pos);
		}else {
			System.out.println("Não Existe no array");
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.lastIndexOf("H"));
		System.out.println(arrayList.lastIndexOf("C"));
		System.out.println(arrayList.lastIndexOf("P"));
		
		arrayList.clear();
		System.out.println(arrayList);
		
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		System.out.println(arrayList);
		
	}

}
