
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Stack - Java \n");
		
		MyStackLinkedList stack = new MyStackLinkedList();

		stack.push(new Node(101));
		stack.push(new Node(202));
		stack.push(new Node(303));
		System.out.print("\n");  
		stack.print();
		System.out.print("\n"); 
		System.out.print("\n"); 
		
		Node node = stack.peek();
		if (node != null) {
			System.out.print("Peek\n");  
			node.printData();
		}
		
		Node node2 = stack.pop();
		if (node != null) {
			System.out.print("Pop\n");  
			node.printData();
		}

		System.out.print("\n");  
		stack.print();
	}
	
}
