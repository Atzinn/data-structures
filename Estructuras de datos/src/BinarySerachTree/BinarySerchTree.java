package BinarySerachTree;

import java.util.Arrays;

public class BinarySerchTree {
	public static void main(String args[]) {
		Employee e1 = new Employee(20, "Pepito Perez", "Ventas", "A-252");
		Employee e2 = new Employee(44, "Ana Lopez", "RRHH", "B-198");
		Employee e3 = new Employee(18, "Elena Nito", "Ventas", "A-241");
		Employee e4 = new Employee(33, "Jose Gomez", "Contabilidad", "B-96");
		Employee e5 = new Employee(64, "Freancisco Perez", "Marketing", "A-69");
		Employee e6 = new Employee(55, "Javier Lopez", "Informatica", "B-161");
		
		BST bst = new BST();
		
		Arrays.asList(e1,e2,e3,e4,e5,e6).forEach(bst::insertar);
		bst.eliminar(20);
		bst.preeorden();
	}
	
	private static void localizar(BST bst, int id) {
		if(bst.existe(id)) {
			System.out.println(bst.obtener(id));
		} else {
			System.out.println("No se encuentra el empleado: " + id);
		}
	}
}
