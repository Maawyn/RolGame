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
	
//	public void nextNode(boolean decision){
//		Node actual = new Node(root);
//		if(decision){
//			actual = actual.getIzq();
//		}else{
//			actual = actual.getDer();
//		}
//	}
	
	
	
}

