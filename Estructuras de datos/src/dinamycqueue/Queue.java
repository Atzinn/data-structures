package dinamycqueue;

public class Queue {
	Node inicio, fin;

	public Queue() {
		inicio = null;
		fin = null;
	}
	
	public void encolar(int dato) {
		Node nodo = new Node(dato);
		if(inicio == null && fin == null) {
			inicio = nodo;
			fin = nodo;
		} else {
			fin.siguiente = nodo;
		}
		
		fin = nodo;
	}
	
	public int desecncolar() {
		if(inicio == null && fin == null) {
			System.out.println("La cola esta vacia, nada que mostrar");
		} else {
			Node eliminado = inicio;
			inicio = inicio.siguiente;
			eliminado.siguiente = null;
			return eliminado.informacion;
		}
		return -1;
	}
	
	public void imprimirCola() {
		if(inicio == null && fin == null) {
			System.out.println("La cola esta vacia, nada que mostrar");
		} else {
			for(Node auxiliar = inicio; auxiliar != null; auxiliar = auxiliar.siguiente) {
				System.out.println(auxiliar.informacion + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Queue cola = new Queue();
		cola.encolar(8);
		cola.encolar(25);
		cola.encolar(2);
		cola.imprimirCola();
		int v = cola.desecncolar();
		System.out.println("El dato eliminado es: " + v); // 8
		cola.imprimirCola();
	}

}
