import java.util.Stack;
 
public class InorderTraversal {
 
 
	public static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
		}
	}
 
	public void inOrder(Node root) {
		if(root !=  null) {
			inOrder(root.left); 
			System.out.printf("%d ",root.data);
			inOrder(root.right);
		}
	}
 
	public void inOrderIter(Node root) {
 
		if(root == null)
			return;
 
		Stack<Node> s = new Stack<Node>();
		Node currentNode=root;
 
		while(!s.empty() || currentNode!=null){
 
			if(currentNode!=null)
			{
				s.push(currentNode);
				currentNode=currentNode.left;
			}
			else
			{
				Node n=s.pop();
				System.out.printf("%d ",n.data);
				currentNode=n.right;
			}
		}
	}
 
	public static void main(String[] args)
	{
		InorderTraversal bi=new InorderTraversal();
		// Creating a binary tree
		Node rootNode=createBinaryTree();
		System.out.println("Using Recursive solution:");
 
		bi.inOrder(rootNode);
 
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Using Iterative solution:");
 
		bi.inOrderIter(rootNode);
	}
 
	public static Node createBinaryTree()
	{
 
		Node rootNode =new Node(40);
		Node node20=new Node(20);
		Node node10=new Node(10);
		Node node30=new Node(30);
		Node node60=new Node(60);
		Node node50=new Node(50);
		Node node70=new Node(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
	}
}
 
