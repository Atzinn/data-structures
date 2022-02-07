package simpleLinkedLists;

public class LinkedLists {
	SimpleNode inicio, fin;
	
	public LinkedLists() {
		inicio = fin = null;
	}
	
	boolean estaVacia() {
		if(inicio == null && fin == null) {
			return true;
		} else {
			return false;
		}
	}
	
	void insertarEnfrente(int dato) {
		SimpleNode nodito = new SimpleNode(dato);
		if(estaVacia() == true) {
			inicio = nodito;
			fin = nodito;
		} else {
			nodito.siguiente = inicio;
		}
		
		inicio = nodito;
	}
	
	void insertarAtras(int dato) {
		SimpleNode nodito = new SimpleNode(dato);
		if(estaVacia() == true) {
			inicio = nodito;
			fin = nodito;
		} else {
			fin.siguiente = nodito;
		}
		fin = nodito;
	}
	
	void eliminarEnfrente() {
		if(estaVacia() == true) {
			System.out.println("La lista esta vacia, no se puede eliminar nada");
		} else if(inicio == fin) {
			inicio = null;
			fin = null;
		} else {
			SimpleNode auxiliar = inicio;
			System.out.println("El dato que fue eliminado es: " + inicio.informacion);
			inicio = inicio.siguiente;
			auxiliar.siguiente = null;
		}
	}
	
	void eliminarAtras() {
		if(estaVacia() == true) {
			System.out.println("La lista esta vacia, no se puede eliminar nada");
		} else if(inicio == fin) {
			inicio = null;
			fin = null;
		} else {
			SimpleNode auxiliar = inicio;
            while(auxiliar.siguiente != fin){
                auxiliar = auxiliar.siguiente;
            }
            System.out.println("El dato que fue eliminado es: " + fin.informacion);
            fin=auxiliar;
            fin.siguiente=null;
		}
	}
	
	void imprimirLista() {
		if(estaVacia() == true) {
			System.out.println("La lista esta vacia, no hay nada que mostrar");
		} else if(inicio == fin) {
			System.out.println(inicio.informacion);
		} else {
			SimpleNode auxiliar = inicio;
			while(auxiliar != null) {
				System.out.println(auxiliar.informacion + " ");
				auxiliar = auxiliar.siguiente;
			}
		}
	}
	
	public static void main(String args[]) {
		LinkedLists lista = new LinkedLists();
		lista.insertarEnfrente(9);
		lista.insertarAtras(8);
		lista.insertarEnfrente(11);
		lista.insertarAtras(5);
		lista.insertarAtras(9);
		lista.imprimirLista();
		lista.eliminarAtras();
		lista.imprimirLista();
	}
}
