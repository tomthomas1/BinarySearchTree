package com.bridgelabz;

/**
 * We have created this class to implement the methods of the binary tree
 * [1] Method insert to add data to BST
 * [2] Method insertAll to insert the node to the tree
 * [3] Method display to display the BST
 * [4] Method inorder to display the BST inorder. In inorder we display first left then data and then the right child.
 * [5] Method preorder to display the BST. In preorder we display root and then left child and then the right child.
 * [6] Method postorder to display the BST. In postorder we display left child and then right and then the root node.
 * [7] Method size to check the size of the BST
 * [8] Method search to search if node is present in the tree
 * @author Tom
 *
 */
public class BinaryTreeServices {
Node root;
	
    /**
     * [1] Method insert to add data to BST
     * 1. First we create a newNode for the data
     * 2. Then we call the insertAll method
     * 3. Then we call the display method to print the BST
     * @param data - We are passing the data to insert
     */
	public void insert(int data) {
		
		Node newNode = new Node(data);
		this.root = insertAll(root, newNode);
		display(this.root);
		System.out.println();
	}

	/**
	 * [2] Method insertAll to insert the node to the tree
	 * 1. First we check if the root is null. If null then we return the node
	 * 2. If the node is less that the root then the node will be entered to the left 
	 * 3. If the node is greater that the root then the node will be entered to the right
	 * 4. After inserting we will return the node 
	 * @param root - Here we pass the root node
	 * @param node - Here we pass the node to insert
	 * @return -  We get the node output with implemented BST
	 */
	public Node insertAll(Node root, Node node) {
		
		if (root == null) 
			return node;
		else if(root.compareTo(node) > 0) {
			System.out.print(" inserted " + node.data + " in the left \n");
			root.left = insertAll(root.left, node);
		}
		
		else if(root.compareTo(node) < 0) {
			System.out.print(" inserted " + node.data + " in the right \n");
			root.right = insertAll(root.right, node);
		}
		
		return root;
	}
	
	/**
	 * [3] Method display to display the BST
	 * 1. If root is null then we will return
	 * 2. Else we will display the left and then root and then the right child.
	 * @param root -  we pass the root to display the BST
	 */
	public void display(Node root) {
		if(root == null)
			return;
		
		display(root.left);
		System.out.print(" " + root.data);
		display(root.right);
	}
	
	/**
	 * [4] Method inorder to display the BST inorder. In inorder we display first left then data and then the right child.
	 * 1. We pass the node and then call the method inorder and check left or right
	 */
	public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.left);
            System.out.print(r.data +" ");
            inorder(r.right);
        }
    }
    /* Function for preorder traversal */
    /**
	 * [5] Method preorder to display the BST. In preorder we display root and then left child and then the right child.
	 * 1. We pass the node and then call the method preorder and check left or right
	 */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.data +" ");
            preorder(r.left);             
            preorder(r.right);
        }
    }
    /* Function for postorder traversal */
    /**
	 * [6] Method postorder to display the BST. In postorder we display left child and then right and then the root node.
	 * 1. We pass the node and then call the method postorder and check left or right
	 */
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.left);             
            postorder(r.right);
            System.out.print(r.data +" ");
        }
    }   
    
    /**
     * [7] Method size to check the size of the BST
     * 1. If root is null then the BST is empty and will return 0
     * 2. We add the right and the left child and the root
     */
    public void size() {
		System.out.println("\n The size of the tree is: " + sizeAll(root));
	}
	
	public int sizeAll(Node root) {
		
		if (root == null)
			return 0;
		
		return sizeAll(root.left) + sizeAll(root.right) + 1;
	}
	
	/**
	 * [8] Method search to search if node is present in the tree
	 * 1. We pass the root and the note to search
	 * 2 if root is null then we return false
	 * 3. If data is present in the tree then we return true
	 * 4. We check the left or right if the node is present.
	 * @param data - we pass the data to check if it is present in tree
	 */
	public void search(int data) {
		if(searchAll(root, data)) 
			System.out.println("Given " +data+ " node is present in the tree ");
		else
			System.out.println(" Given " +data+ " node is not present in the tree");		
	}
	
	public boolean searchAll(Node root, int data) {
		
		if (root == null)
			return false;
		if(root.data == data) 
			return true;
		else		
			return searchAll(root.left, data) || searchAll(root.right, data);
	}
}