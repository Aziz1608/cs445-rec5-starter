package rec5;

public class LinkedListExercises {
	
	//this creates a list of N integers 0 1 2 ... N-1
	public static Node<Integer> getIntList(int N){
		Node<Integer> head = new Node<Integer>(0);
		Node<Integer> curr = head;
		for(int i=1; i<N; i++) {
			curr.setNext(new Node<Integer>(i) );
			curr = curr.getNext();
		}
			
		return head;
	}
	
	// Exercise 1
	// Return a string representing the data of all nodes
	public static String listToString (Node<Integer> head) {
		StringBuilder sb = new StringBuilder("[");
		//TODO your code here
		
		sb.append("]");
		return sb.toString();
	}
	
	// Exercise 2
	// return a new list of integers where each node contains a sum of data 
	// from the corresponding nodes of `headA` and `headB` lists
	public static Node<Integer> addTwo (Node<Integer> headA, Node<Integer> headB){
		Node<Integer> result = null;
		//TODO your code here
		
		return result;
	}
	
	// Exercise 3. 
	// Return a new list where each node contains a cumulative sum 
	// of data from all nodes of the input list `head` 
	public static Node<Integer> cumSum (Node<Integer> head)  {		
		Node<Integer> result = null;
		//TODO your code here
		
		return result;
	}
	
	// Exercise 4. 
	// Modify list `head` so each node in it is repeated twice 
	public static void doubleElements(Node<Integer> head) {
		//TODO your code here
	}
	
	// Exercise 5. 
	// Return a list where all nodes are in a reverse order
	public static Node<Integer> getReverse (Node<Integer> head){
		Node<Integer> result = null;
		//TODO your code here
		
		return result;		
	}
	
	// Exercise 6. 
	// Find and return the data at the k-th position from the end node (the last node is at k=0)
	public static int getKthFromEnd (Node<Integer> head, int k) {	
		return 0;		
	}	
}