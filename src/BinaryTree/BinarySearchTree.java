package BinaryTree;

public class BinarySearchTree {

	public static Node root;

	public BinarySearchTree(){ // Constructor .........
		this.root=null;
	}


	public boolean find(int data){
		Node current=root;
		while(current!=null){

			if(current.data==data){
				return true;
			}
			else if(data<current.data)
			{
				current=current.left;
			}
			else
			{
				current=current.right;
			}
		}

		return false;

	}


	public void insert(int data){

		Node NewNode=new Node(data);
		if(root==null){
			root=NewNode;
			return;
		}
		Node current = root;
		Node parent=null;
		
		while(true){
			parent=current;
			if(data<current.data)
			{
				current=current.left;
				if(current==null){
					parent.left=NewNode;
					return;
				}
			}
			else
			{
				current=current.right;
				if(current==null){
					parent.right=NewNode;
					return;
				}
			}

			}
	}
	
	
	public void display(Node root){
		
		if(root==null){
			System.out.print("-1");
		}
		if(root!=null){
			System.out.print(" " + root.data);
			display(root.left);
			
			display(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree b = new BinarySearchTree();
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);	
	}


}
