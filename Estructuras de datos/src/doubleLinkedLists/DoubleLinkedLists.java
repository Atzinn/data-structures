package doubleLinkedLists;

public class DoubleLinkedLists {
	DoubleNode inicio, fin;
	
	public DoubleLinkedLists() {
		inicio = fin = null;
	}
	
	boolean estaVacia() {
		if( inicio == null && fin == null) {
			return true;
		}
		return false;
	}
	
	void insertarEnfrente(int dato) {
		/*
		 * Insertamos un nuevo valor al inicio de la lista
		 * y lo definimos como el nodo inicial de la misma
		 */
		
		DoubleNode nodito = new DoubleNode(dato);
		if(estaVacia() == true) {
			inicio = nodito;
			fin = nodito;
		} else {
			nodito.siguiente = inicio;
			inicio.anterior = nodito;
		}
		
		inicio = nodito;
	}
	
	void insertarAtras(int dato) {
		/*
		 * Insertamos un valor al final de la lista
		 * y lo definimos como el nuevo final de la misma. 
		 */
		DoubleNode nodito = new DoubleNode(dato);
		if(estaVacia() == true ) {
			inicio = nodito;
			fin = nodito;
		} else {
			fin.siguiente = nodito;
			nodito.anterior = fin;
		}
		
		fin = nodito;
	}
	
	void eliminarEnfrente() {
		/**
		 * Eliminamos el valor inicial de la lista y al dato siguiente
		 * se define como el nuevo inicio de la lista 
		 */
		if(estaVacia() == true) {
			System.out.println("La lista esta vacia, no hay nada que eliminar");
		} else if(inicio == fin) {
			inicio = null;
			fin = null;
		} else {
			DoubleNode auxiliar = inicio;
			System.out.println("El dato a eliminar es: " + inicio.informacion);
			inicio = inicio.siguiente;
			inicio.anterior = null;
			auxiliar.anterior = null;
			auxiliar.siguiente = null;
		}
	}
	
	void eliminarAtras() {
		// Eliminamos el valor de la lista y a su anterior lo definimos como el
		// nuevo final de la lista
		
		if(estaVacia() == true) {
			System.out.println("La lista esta vacia no hay nada que mostrar");
		} else if(inicio == fin) {
			inicio = null;
			fin = null;
		} else {
			DoubleNode auxiliar = fin;
			System.out.println("El dato a eliminar es: " + fin.informacion);
			fin = fin.anterior;
			fin.siguiente = null;
			auxiliar.anterior = null;
			auxiliar.siguiente = null;
		}
	}
	
	void imprimirListaIzqDer() { // De inicio a fin
		if(estaVacia() == true) {
			System.out.println("La lista esta vacia, no hay nada que mostrar");
		} else if(inicio == fin) {
			System.out.println(inicio.informacion);
		} else {
			DoubleNode auxiliar = inicio;
			while(auxiliar != null) {
				System.out.println(auxiliar.informacion + " ");
				auxiliar = auxiliar.siguiente;
			}
		}
	}
	
	void imprimirListaDerIzq() { // De fin a inicio
		if(estaVacia() == true) {
			System.out.println("La lista esta vacia, no hay nada que mostrar");
		} else if(inicio == fin) {
			System.out.println(inicio.informacion);
		} else {
			DoubleNode auxiliar = fin;
			while(auxiliar != null) {
				System.out.println(auxiliar.informacion + " ");
				auxiliar = auxiliar.anterior;
			}
		}
	}
	
	public static void main(String args[]) {
		DoubleLinkedLists lista = new DoubleLinkedLists();
		lista.insertarEnfrente(19);
		lista.insertarAtras(28);
		lista.insertarEnfrente(11);
		lista.insertarAtras(51);
		lista.insertarAtras(9);
		lista.imprimirListaIzqDer();
		lista.eliminarAtras();
		lista.imprimirListaDerIzq();
	}
}
