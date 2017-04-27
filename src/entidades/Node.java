package entidades;

public class Node {
	private Node pred, izq, der;
	private Object info;
	private int grado, id;
	
	public Node() { // Nodo vacio
		this.pred = null;
		this.izq = null;
		this.der = null;
		this.info = null;
		this.grado = 0;
		this.id = -1;
	}
	
	public Node(Object info) { //Nodo con informacion
		this.pred = null;
		this.izq = null;
		this.der = null;
		this.info = info;
		this.grado = 0;
		this.id = -1;
	}

	
	public Node(Node pred, Node izq, Node der, Object info, int grado, int id) { //
		this.pred = pred;
		this.izq = izq;
		this.der = der;
		this.info = info;
		this.grado = grado;
		this.id = id;
	}
	
	public Node(Node pred, Object info) { //Nodo sin hijos
		this.pred = pred;
		this.izq = null;
		this.der = null;
		this.info = info;
		this.grado = 0;
		this.id = -1;
	}

	
	public Node getPred() {
		return pred;
	}

	public void setPred(Node pred) {
		this.pred = pred;
	}

	
	public Node getIzq() {
		return izq;
	}

	public void setIzq(Node izq) {
		this.izq = izq;
	}

	
	public Node getDer() {
		return der;
	}

	public void setDer(Node der) {
		this.der = der;
	}


	public Object getInfo() {
		return info;
	}

	public void setInfo(Object info) {
		this.info = info;
	}


	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public boolean hasIzq(){
		return this.izq != null;
	}
	
	public boolean hasDer(){
		return this.der != null;
	}
	
	@Override
	public String toString(){
		return "";
	}
}
