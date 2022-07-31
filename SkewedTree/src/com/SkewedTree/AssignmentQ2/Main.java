package com.SkewedTree.AssignmentQ2;


public class Main {
	
	public static Node node;

    static Node prevNode = null;
    static Node headNode = null;
   
    static void BSToSkewed(Node root,
                                  int order)
    {
       
        if(root == null)
        {
            return;
        }
       
       
        if(order > 0)
        {
            BSToSkewed(root.right, order);
        }
        else
        {
        	BSToSkewed(root.left, order);
        }
        Node rightNode = root.right;
        Node leftNode = root.left;
       
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
        if (order > 0)
        {
        	BSToSkewed(leftNode, order);
        }
        else
        {
        	BSToSkewed(rightNode, order);
        }
    }
   
    static void traverse(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverse(root.right);       
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main.node = new Node(50);
		Main.node.left = new Node(30);
		Main.node.right = new Node(60);
		Main.node.left.left = new Node(10);
		Main.node.right.left= new Node(55);
	    BSToSkewed(node, 0);
	    traverse(headNode);

	}
	
	
}

class Node
{
    int val;
    Node left, right;

    Node(int item)
    {
        val = item;
        left = right = null;
    }
}




