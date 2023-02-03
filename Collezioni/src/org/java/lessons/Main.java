package org.java.lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	/*	int n=4;			//tipo primitivo (vengono allocati 4 byte)
		Integer n1;		//Classe Integer (wrapper)
		int n2;
		n1=n;		//autoboxing
		n2=n1;		//autounboxing
		
		ArrayList<Integer> elencoNomi=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		String nome;
		do {
			System.out.println("Inserisci un nome (Enter per uscire): ");
			nome=s.nextLine();
			if (!nome.equals(""))
				elencoNomi.add(nome);
		} while (!nome.equals(""));
		
		s.close();
		System.out.println("I nomi inseriti sono: ");
		for(int i=0;i<elencoNomi.size();i++)
			System.out.println(elencoNomi.get(i));
		
		
		String[] arrayNomi=new String[elencoNomi.size()];
		elencoNomi.toArray(arrayNomi);
		
		List<String> elenco1=Arrays.asList(arrayNomi);
		*/
		
		ArrayList<Animale> elencoAnimali=new ArrayList<>();
		Gatto g=new Gatto("Pallino");
		elencoAnimali.add(g);
		elencoAnimali.add(new Cane("Flash"));
		elencoAnimali.add(g);
		
		Collections.sort(elencoAnimali);  //ordinamento alfabetico per nome (predefinito)
		Collections.sort(elencoAnimali, new CompareRazza() );  //ordinamento alfabetico per razza
	/*	
		for(int i=0;i<elencoAnimali.size();i++) {
			System.out.print(elencoAnimali.get(i).getNome()+": ");
			elencoAnimali.get(i).faiVerso();
		}
*/
		System.out.println("**** ARRAYLIST ****");

		Iterator<Animale> iterator=elencoAnimali.iterator();
		
		while (iterator.hasNext()) {
			Animale a=iterator.next();
			System.out.print(a.getNome()+": ");
			a.faiVerso();
		}
		
		
		System.out.println("**** HASHSET ****");
		HashSet<Animale> insiemeAnimali=new HashSet<>();
		Gatto g1=new Gatto("Nerina");
		insiemeAnimali.add(g1);
		insiemeAnimali.add(new Cane("Black"));
		insiemeAnimali.add(g1);		//ignorato
		insiemeAnimali.add(new Cane("Thor"));
		insiemeAnimali.add(new Gatto("Adix"));
		insiemeAnimali.add(new Cane("Thor"));
		iterator=insiemeAnimali.iterator();
		while (iterator.hasNext()) {
			Animale a=iterator.next();
			System.out.print(a.getNome()+": ");
			a.faiVerso();
		}

		
		
		
		HashMap<String,Animale> mappaAnimali=new HashMap<>();
				
		mappaAnimali.put("G001",new Gatto("Pallino"));
		mappaAnimali.put("C001",new Cane("White"));
		mappaAnimali.put("G002",new Gatto("Bianca"));
		
		
		System.out.println("**** HASHMAP (scorro per chiave) ****");
		
		Iterator<String> keyIterator=mappaAnimali.keySet().iterator();
				
		while (keyIterator.hasNext()) {
			String key=keyIterator.next();
			Animale a=mappaAnimali.get(key);
			System.out.print(a.getNome()+": ");
			a.faiVerso();
		}
		
		
		System.out.println("**** HASHMAP (scorro per entry) ****");
		
		Iterator<Map.Entry<String, Animale>> entryIterator=mappaAnimali.entrySet().iterator();
				
		while (entryIterator.hasNext()) {
			Map.Entry<String, Animale> entry=entryIterator.next();
			Animale a=entry.getValue();
			String key=entry.getKey();
			System.out.print(key+" - "+ a.getNome()+": ");
			a.faiVerso();
		}
		
		System.out.println("**** ARRAYLIST (for-each) ****");
		for (Animale a:elencoAnimali) {
			System.out.print(a.getNome()+": ");
			a.faiVerso();
		}
		
		
		System.out.println("**** HASHSET (for-each) ****");
		for (Animale a:insiemeAnimali) {
			System.out.print(a.getNome()+": ");
			a.faiVerso();
		}
		
		System.out.println("**** HASHMAP (for-each Animale) ****");
		for (Animale a:mappaAnimali.values()) {
			System.out.print(a.getNome()+": ");
			a.faiVerso();
		}
		
		System.out.println("**** HASHMAP (for-each key) ****");
		for (String key:mappaAnimali.keySet()) {
			Animale a=mappaAnimali.get(key);
			
			System.out.print(a.getNome()+": ");
			a.faiVerso();
		}
		
		
		
	}
}
