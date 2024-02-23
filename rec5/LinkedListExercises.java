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
		Node<Integer> current = head;
    		while (current != null) {
        		sb.append(current.getData());
        		// Check if current node is not the last node to avoid adding a space at the end
        		if (current.getNext() != null) {
            			sb.append(" ");
        		}
        		current = current.getNext();
    		}
		sb.append("]");
		return sb.toString();
	}
	
	// Exercise 2
	// return a new list of integers where each node contains a sum of data 
	// from the corresponding nodes of `headA` and `headB` lists
	public static Node<Integer> addTwo (Node<Integer> headA, Node<Integer> headB){
		Node<Integer> resultHead = null, resultTail = null;
		// Traverse both lists
    		while (headA != null && headB != null) {
        		// Sum the values of the two nodes
        		int sum = headA.getData() + headB.getData();

        		// Create a new node with the sum and add it to the result list
        		Node<Integer> newNode = new Node<>(sum);
        		if (resultHead == null) {
            			// This is the first node, so it becomes the head of the result list
            			resultHead = newNode;
            			resultTail = newNode;
        		} else {
            			// Append the new node to the end of the list and move the tail
            			resultTail.setNext(newNode);
            			resultTail = newNode;
        		}

        		// Move to the next nodes in both input lists
        		headA = headA.getNext();
        		headB = headB.getNext();
    		}
		return resultHead;
	}
	
	// Exercise 3. 
	// Return a new list where each node contains a cumulative sum 
	// of data from all nodes of the input list `head` 
	public static Node<Integer> cumSum (Node<Integer> head)  {		
		if (head == null) {
	        	return null; 
	    	}
	
	    	Node<Integer> resultHead = new Node<>(head.getData()); 
	    	Node<Integer> currentResult = resultHead;
	    	Node<Integer> currentInput = head.getNext();
	    	int cumulativeSum = head.getData(); 
	
	    	// Iterate through the rest of the list
	    	while (currentInput != null) {
	        	cumulativeSum += currentInput.getData(); 
	        	Node<Integer> newNode = new Node<>(cumulativeSum); 
	        	currentResult.setNext(newNode); 
	        	currentResult = newNode; 
	
	        	currentInput = currentInput.getNext(); 
	    	}
		return resultHead;
	}
	
	// Exercise 4. 
	// Modify list `head` so each node in it is repeated twice 
	public static void doubleElements(Node<Integer> head) {
		Node<Integer> current = head;
    
    		while (current != null) {
        		// Create a new node with the same data as the current node
        		Node<Integer> newNode = new Node<>(current.getData());
        
        		// Insert the new node after the current node
        		newNode.setNext(current.getNext()); 
       			current.setNext(newNode); 
        
        		current = newNode.getNext();
    		}
	}	
	
	// Exercise 5. 
	// Find and return the data at the k-th position from the end node (the last node is at k=0)
	public static int getKthFromEnd (Node<Integer> head, int k) {	
		Node<Integer> lead = head;
    		Node<Integer> follow = head;
    
    		// Move lead pointer k steps ahead
    		for (int i = 0; i < k; i++) {
        		if (lead == null) {
            			throw new IllegalArgumentException("List is shorter than k nodes");
        		}
        		lead = lead.getNext();
    		}
    
    		// Move both pointers until lead reaches the end
    		while (lead != null) {
        		lead = lead.getNext();
        		follow = follow.getNext();
    		}
    
    		return follow.getData();		
	}	
}
