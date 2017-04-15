package entitiades;

public class Item {
	private String nombre, descripcion;
	//private Efecto efec;
	private int cantidad;
	
	public Item(String nombre, String descripcion){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = 1;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
