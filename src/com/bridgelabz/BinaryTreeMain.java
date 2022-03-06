package com.bridgelabz;

import java.util.Scanner;
/**
 * Main method to implement the methods.
 * @author Tom
 *
 */
public class BinaryTreeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeServices obj = new BinaryTreeServices();
		
		obj.insert(56);
		obj.insert(30);
		obj.insert(70);
		
		System.out.print("\n Binary Search Tree ");
        System.out.print("\nPost order : ");
        obj.postorder();
        System.out.print("\nPre order : ");
        obj.preorder();
        System.out.print("\nIn order : ");
        obj.inorder();
		
	}

}