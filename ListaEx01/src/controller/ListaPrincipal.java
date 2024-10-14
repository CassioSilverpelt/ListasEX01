package controller;

import model.IntLista;
import model.Lista;

public class ListaPrincipal {

	public static void main(String[] args) {
		ListaController<Integer> listCon = new ListaController<>();
		Lista<Integer> lista = new Lista<>();
		lista.addFirst(16);
		lista.addFirst(4);
		lista.addFirst(13);
		lista.addFirst(2);
		lista.addFirst(6);
		lista.addFirst(7);
		lista.addFirst(9);
		lista.addFirst(12);
		lista.addFirst(18);
		lista.addFirst(5);
		lista.addFirst(3);
		
		System.out.println("Lista sem inversão: \n");
		listCon.imprimeLista(lista);
		
		listCon.inverteLista(lista);
		
		System.out.println("\nLista com inversão: \n");
		listCon.imprimeLista(lista);
		
		int tamanho = lista.size();
		System.out.println("\nTamanho da lista: " + tamanho);
		
	}

}
