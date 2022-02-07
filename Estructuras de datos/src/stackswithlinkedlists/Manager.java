package stackswithlinkedlists;

public class Manager {
	public static void main(String args[]) {
		Stack nuevaPila = new Stack();
		nuevaPila.apilar('A');
		nuevaPila.apilar('B');
		nuevaPila.apilar('C');
		nuevaPila.imprimir();
		System.out.println();
		nuevaPila.desapilar();
		nuevaPila.imprimir();
	}
}
