package entidades;

public class Item {
	private String nombre, descripcion;
	//private Efecto efec;
	private int cantidad, id;
	
	public Item(String nombre, String descripcion, int id){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = 1;
		this.id = id;
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
	
	public int getId(){
		return id;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
