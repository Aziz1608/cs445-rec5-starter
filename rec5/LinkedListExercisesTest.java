package rec5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListExercisesTest {

	@Test
	void testListToString() {
		Node<Integer> head = null;
		assertEquals("[]", LinkedListExercises.listToString(head));
		head = LinkedListExercises.getIntList(10);
		String expected = "[0 1 2 3 4 5 6 7 8 9]";
		assertEquals(expected, LinkedListExercises.listToString(head));
	}

	@Test
	void testAddTwo() {
		Node<Integer> headA = LinkedListExercises.getIntList(10);
		Node<Integer> headB = LinkedListExercises.getIntList(5);
		
		String expected = "[0 2 4 6 8]";
		Node<Integer> result = LinkedListExercises.addTwo(headA, headB);
		assertEquals(expected, LinkedListExercises.listToString(result));
		
		headA = LinkedListExercises.getIntList(1);
		headB = LinkedListExercises.getIntList(5);
		result = LinkedListExercises.addTwo(headA, headB);
		
		assertEquals("[0]", LinkedListExercises.listToString(result));
	}

	@Test
	void testCumSum() {
		Node<Integer> head = null;
		Node<Integer> result = LinkedListExercises.cumSum(head);
		assertEquals("[]", LinkedListExercises.listToString(result));
		
		head = LinkedListExercises.getIntList(5);
		String expected = "[0 1 3 6 10]";
		result = LinkedListExercises.cumSum(head);
		assertEquals(expected, LinkedListExercises.listToString(result));
	}

	@Test
	void testDoubleElements() {
		Node<Integer> head = null;
		LinkedListExercises.doubleElements(head);
		assertEquals("[]", LinkedListExercises.listToString(head));
		
		head = LinkedListExercises.getIntList(6);
		String expected = "[0 0 1 1 2 2 3 3 4 4 5 5]";
		LinkedListExercises.doubleElements(head);
		assertEquals(expected, LinkedListExercises.listToString(head));
	}
	
	@Test
	void testGetKthFromEnd() {
		Node<Integer> head = LinkedListExercises.getIntList(1);
		int k=0;
		int result = LinkedListExercises.getKthFromEnd(head, k);
		int expected = 0;
		assertEquals(expected,result);
		
		head = LinkedListExercises.getIntList(2);
		k=1;
		result = LinkedListExercises.getKthFromEnd(head, k);
		expected = 0;
		assertEquals(expected,result);
		
		head = LinkedListExercises.getIntList(10);
		k=2;
		result = LinkedListExercises.getKthFromEnd(head, k);
		expected = 7;
		assertEquals(expected,result);
	}

}
