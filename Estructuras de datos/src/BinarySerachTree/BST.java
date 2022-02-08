package BinarySerachTree;

public class BST implements IBST<Employee>{
	private Employee valor;
	private  BST izdo, dcho, padre;
		
	@Override
	public boolean esVacio() {
		return valor == null;
	}
	
	
	@Override
	public boolean esHoja() {
		return valor != null && izdo == null && dcho == null;
	}
	
	private void insertarImpl(Employee empl, BST padre) {
		if(valor == null) {
			this.valor = empl;
			this.padre = padre;
		} else {
			if(empl.compareTo(valor) < 0) {
				if(izdo == null) izdo = new BST();
				izdo.insertarImpl(empl, this); 
			} else if(empl.compareTo(valor) > 0){
				if(dcho == null) dcho = new BST();
				dcho.insertarImpl(empl, this);
			} else {
				throw new RuntimeException("Tratando de insertar un elemento duplicado");
			}
		}
	}

	public void insertar(Employee empl) {
		insertarImpl(empl, null);
	}
	
	@Override
	public boolean existe(int id) {
		if(valor != null) {
			if(id == valor.getId()) {
				return true;
			} else if(izdo != null && id < valor.getId()) {
				return izdo.existe(id);
			} else if(dcho != null && id > valor.getId()) {
				return dcho.existe(id);
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public Employee obtener(int id) {
		if(valor != null) {
			if(id == valor.getId()) {
				return valor;
			} else if(izdo != null && id < valor.getId()) {
				return izdo.obtener(id);
			} else if(dcho != null && id > valor.getId()){
				return dcho.obtener(id);
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	private void preeordenImpl(String prefijo) {
		if(valor != null) {
			System.out.println(prefijo + valor);
			if(izdo != null) izdo.preeordenImpl(prefijo + "  ");
			if(dcho != null) dcho.preeordenImpl(prefijo + "  ");
		}
	}
	
	@Override
	public void preeorden() {
		preeordenImpl("");
	}

	private void inordenImpl(String prefijo) {
		if(valor != null) {
			if(izdo != null) izdo.inordenImpl(prefijo + "  ");
			System.out.println(prefijo + valor);
			if(dcho != null) dcho.inordenImpl(prefijo + "  ");
		}
	}
	
	@Override
	public void inorden() {
		inordenImpl("");
		
	}

	private void posordenImpl(String prefijo) {
		if(valor != null) {
			if(izdo != null) izdo.posordenImpl(prefijo + "  ");
			if(dcho != null) dcho.posordenImpl(prefijo + "  ");
			System.out.println(prefijo + valor);
		}
	}
	
	@Override
	public void posorden() {
		posordenImpl("");
		
	}

	private BST minimo() {
		if(izdo != null && !izdo.esVacio()) {
			return izdo.minimo();
		} else {
			return this;
		}
	}
	
	private void eliminarImpl(int id) {
		if(izdo != null && dcho != null) {
//			Eliminar con dos hijos
			BST  minimo = dcho.minimo();
			this.valor = minimo.valor;
			dcho.eliminar(minimo.valor.getId());
		} else if(izdo != null || dcho != null) {
//			Eliminar con 1 hijo
			BST sustituto = izdo != null ? izdo : dcho;
			this.valor = sustituto.valor;
			this.izdo = sustituto.izdo;
			this.dcho = sustituto.dcho;
		} else {
//			Eilinar con 0 hijos
			if(padre != null) {
				if(this == padre.izdo) {
					padre.izdo = null;
				}
				if(this == padre.dcho) {
					padre.dcho = null;
				}
				padre = null;
			}
			valor = null;
		}
	}
	
	@Override
	public void eliminar(int id) {
		if(valor != null) {
			if(id == valor.getId()) {
				eliminarImpl(id);
			} else if(izdo != null && id < valor.getId()) {
				izdo.eliminar(id);
			} else if(dcho != null && id > valor.getId()) {
				dcho.eliminar(id);
			}
		}
	}

}
