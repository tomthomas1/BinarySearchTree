package com.bridgelabz;

/**
 * Here we hace created a class Node that Implements the comparable interface
 * Here we have created variable data, right & left
 * @author Tom
 *
 */
public class Node implements Comparable<Node>{

	int data;
	Node right;
	Node left;
	
	//constructor
	public Node(int data) {
		super();
		this.data = data;
	}

	/**
	 * We are overriding the compareTo method 
	 * If the node is more that it will return 1 and if less than return -1
	 */
	@Override
	public int compareTo(Node node) {
		// TODO Auto-generated method stub
		
		if(this.data > node.data)
			return 1;
		else if (this.data < node.data)
			return -1;
		else
			return 0;
	}	
	
	
	
}