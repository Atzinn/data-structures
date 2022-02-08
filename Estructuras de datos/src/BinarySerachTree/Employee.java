package BinarySerachTree;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private String nombre, puesto, despacho;
	private int id;
	
	public Employee(int id, String nombre, String puesto, String despacho) {
		this.id = id;
		this.nombre = nombre;
		this.puesto = puesto;
		this.despacho = despacho;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [nombre=" + nombre + ", puesto=" + puesto + ", despacho=" + despacho + ", id=" + id + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(despacho, id, nombre, puesto);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(despacho, other.despacho) && id == other.id && Objects.equals(nombre, other.nombre)
				&& Objects.equals(puesto, other.puesto);
	}
	
	@Override
	public int compareTo(Employee empl) {
		// TODO Auto-generated method stub
		if(id == empl.id) {
			return 0;
		} else if(id < empl.id) {
			return -1;
		} else {
			return 1;
		}
	}
	
}
