package stackswithlinkedlists;

public class Node {
	private char dato;
	private Node siguiente;
	
	
	public Node(char dato) {
		this.dato = dato;
	}


	public char getDato() {
		return dato;
	}


	public void setDato(char dato) {
		this.dato = dato;
	}


	public Node getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Node siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
}
