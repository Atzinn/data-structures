package stackswithlinkedlists;

public class Stack {
	Node topOfStack;
	
	public void apilar(char dato) {
		Node nuevo = new Node(dato);
		if(topOfStack == null) {
			topOfStack = nuevo;
		} else {
			nuevo.setSiguiente(topOfStack);
			topOfStack = nuevo;
		}
	}
	
	public char desapilar() {
		Node tmp = topOfStack;
		topOfStack = topOfStack.getSiguiente();
		return tmp.getDato();
	}
	
	public void imprimir() {
		Node tmp = topOfStack;
		while(tmp != null) {
			System.out.println(tmp.getDato() + " ");
			tmp = tmp.getSiguiente();
		}
	}
}
