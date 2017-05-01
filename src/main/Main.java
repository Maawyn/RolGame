package main;

import java.util.Random;
import java.util.Scanner;

import controladores.TreeManager;
import entidades.Node;
import tree.BinaryTree;

public class Main {

	public static void main(String[] args) {
		TreeManager treeManager = new TreeManager();
		BinaryTree binaryTree = treeManager.generateBinaryTree();
		Scanner sc = new Scanner(System.in);
		Node actual = binaryTree.getRoot();
		Random rd = new Random();
		while(actual.hasChildren()){
			System.out.println(actual.show()); //Print
			int pos = sc.nextInt();
			actual = actual.getNext(pos);
			System.out.println(actual.show());
			System.out.println(rd.nextBoolean());
			actual = actual.getNextByIA(rd.nextBoolean());
			System.out.println(actual.show());
		}
		System.out.println("Se acabó el juego.");
//		System.out.println("¿Hola?");
//		int elem = 128;
//		int p = elem;
//		for(int i = p*2; i< p*4; i++){
//			System.out.println("BTree.addTo(" + elem + ", new Node(\"\", 8, "+ i +"));");
//			if (i % 2 != 0){
//				elem++;
//			}
//		}
	}

}
