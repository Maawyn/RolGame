package main;

import java.util.Random;
import java.util.Scanner;

import controladores.TreeManager;
import entidades.Node;
import tree.BinaryTree;

public class Main {

	public static void main(String[] args) {
		//binaryTree.preOrder(binaryTree.getRoot());
		TreeManager treeManager = new TreeManager(); //The decision tree was created
		BinaryTree binaryTree = treeManager.generateBinaryTree();
		Scanner sc = new Scanner(System.in);
		Node actual = binaryTree.getRoot();
		Random rd = new Random();
//		binaryTree.inOrder(7, actual);
		

		while(actual.hasChildren()){
			System.out.println(actual.show()); //Printa el primer nodo y sus hijos.
			int pos = sc.nextInt(); //Elección del jugador
			actual = actual.getNext(pos);
			actual = actual.getNextByIA(rd.nextBoolean());
		}
		
		System.out.println(actual.show());
		System.out.println("////////////////////////\n///Se acabó el juego ///\n////////////////////////");
		
//		int elem = 128;
//		int p = elem;
//		for(int i = p*2; i< p*4; i++){
//			System.out.println("BTree.addTo(" + elem + ", new Node(\"\", 8, "+ i +"));");
//			if (i % 2 != 0){
//				elem++;
//			}
//		}
//		sc.close();
	}

}
