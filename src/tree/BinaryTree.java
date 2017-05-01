package tree;

import entidades.Node;

public class BinaryTree {
	private Node root;
	
	public BinaryTree(){
		root = null;
	}
	
	//Método de inserción
	public void addRoot(Node e){
		if(isEmpty()) {
			root = e;
		}else{
			throw new RuntimeException("Root has already a value");
		}
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public void addTo(int idParent, Node e){
		Node aux = searchId(idParent, root);
		if(aux.getIzq() == null){
			aux.setIzq(e);
			e.setPred(aux);
		}else if(aux.getDer() == null){
			aux.setDer(e);
			e.setPred(aux);
		}
	}
	
	public Node searchId(int id, Node start){
		Node actual = start;
		if(isEmpty()) throw new RuntimeException ("This tree is empty"); 
		if(actual.getId() == id){
			return actual; // Base
		}
		
		if(actual.hasIzq() && actual.getId() != id) // If the actual node has a different id look the left child
			actual = searchId(id, actual.getIzq());
		if(actual.hasDer() && actual.getId() != id) // If the actual node has a different id look the right child
			actual = searchId(id, actual.getDer()); 
		
		return actual;
	}
	
	public Node getRoot(){
		return root;
	}
	
//	public void nextNode(boolean decision){
//		Node actual = new Node(root);
//		if(decision){
//			actual = actual.getIzq();
//		}else{
//			actual = actual.getDer();
//		}
//	}
	
	
	
}

