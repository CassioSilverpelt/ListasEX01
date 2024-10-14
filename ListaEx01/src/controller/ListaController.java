package controller;

import model.IntLista;
import model.Lista;
import model.No;

public class ListaController<T> {

	public ListaController() {
		super();
	}
	
	public void inverteLista(Lista<T> lista) {
		int tamanho = lista.size();
		int cont = 0;
		while (cont < tamanho) {
			try {
				T valor = lista.get(cont);
				lista.remove(cont);
				lista.addFirst(valor);
				cont++;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

	public void imprimeLista(Lista<T> lista) {
		int tamanho = lista.size();
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.println(lista.get(i));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
