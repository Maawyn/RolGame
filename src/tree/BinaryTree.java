package tree;

import entidades.Node;


public class BinaryTree {
	Node root;
	
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
	
	public void addTo(Node e, Node parent){
		if(parent.getIzq() == null){
			parent.setIzq(e);
		}else if(parent.getDer() == null){
			parent.setDer(e);
		}else{
			throw new RuntimeException("Childs are full");
		}
	}
	
	public Node searchId(int id, Node start){
		Node actual = start;
		if(isEmpty()) throw new RuntimeException ("This tree is empty"); 
		if(actual.getId() == id) return actual; // Base
		
		if(actual.hasIzq() && actual.getId() != id) // If the actual node has a different id look the left child
			actual = searchId(id, actual.getIzq());
		if(actual.hasDer() && actual.getId() != id)
			actual = searchId(id, actual.getDer()); // If the actual node has a different id look the right child
		return actual;
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

