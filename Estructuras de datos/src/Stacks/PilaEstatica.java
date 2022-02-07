package Stacks;

public class PilaEstatica {
	private int pila[];
	private int top; // Indica la posicion del ultimo elemento insertado
	private int capacidad;
	
	public PilaEstatica(int cap) {
		capacidad = cap;
		pila = new int[capacidad];
		top = -1;
	}
	
	public boolean estaVacia() {
		return (top == -1);
	}
	
	public boolean estaLlena() {
		return ((top + 1) == capacidad);
	}
	
	public void apilar(int elemento) {
		if(estaLlena() == false) {
			pila[++top] = elemento;
		} else {
			System.out.println("Stackoverflow: La pila ya está llena");
		}
	}
	
	public int desapilar() {
		if(estaVacia() == false) {
			return pila[top--];
		} else {
			System.out.println("Stackunderflow: No hay nada en la pila");
		}
		return -1;
	}
	
	public static void main(String args[]) {
		PilaEstatica pilita = new PilaEstatica(5);
		pilita.apilar(1);
		pilita.apilar(12);
		pilita.apilar(3);
		int r = pilita.desapilar();
		System.out.println("El dato eliminado es: " + r); // 3
		boolean vacia = pilita.estaVacia();
		boolean llena = pilita.estaLlena();
		System.out.println("¿Esta llena la pila? " + llena); // false
		System.out.println("¿Esta vacia la pila? " + vacia); // false
	}
}
