package BinarySerachTree;

public interface IBST<T extends Comparable> {
	void insertar(T empl);
	boolean existe (int id);
	T obtener(int id);
	boolean esHoja();
	boolean esVacio();
	void preeorden();
	void inorden();
	void posorden();
	void eliminar(int id);
}
