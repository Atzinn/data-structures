package Queue;

public class StaticQueue {
	private int cola[];
	private int top; //Indica la poscicion del ultimo elemento insertado
	private int capacidad;
	
	public StaticQueue(int cap) {
		capacidad = cap;
		cola = new int[capacidad];
		top = -1;
	}
	
	public boolean estaVacia() {
		return (top == -1);
	}
	
	public boolean estaLlena() {
		return ((top + 1) == capacidad);
	}
	
	public void encolar(int elemento) {
		if(estaLlena() == false) {
			cola[++top] = elemento;
		} else {
			System.out.println("Queue overflow: no se puede en colar");
		}
	}
	
	public int desencolar() {
		if(estaVacia() == false) {
			int dato = cola[0];
			top--;
			for(int i = 0; i <= top; i++) {
				cola[i] = cola[i + 1];
			}
			return dato;
		} else {
			System.out.println("Queue underflow: no se puede desencolar");
		}
		return -1;
	}
	
	public static void main(String args[]) {
		StaticQueue colita = new StaticQueue(5);
		colita.encolar(1);
		colita.encolar(12);
		colita.encolar(3);
		int r = colita.desencolar();
		System.out.println("El dato eliminado es: " + r); // 1
		boolean llena = colita.estaLlena();
		boolean vacia = colita.estaVacia();
		System.out.println("¿Esta vacia la cola? " + vacia); // false
		System.out.println("¿Esta llena la cola? " + llena); // false
		
	}
}
