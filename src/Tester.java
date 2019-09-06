/**
* CS 111 Section No. 002
* Lab Assignment 10
* @author Samuel Harris 
**/

public class Tester {
	public static void main(String args[]) {

		CircularQueue<String> q1 = new CircularQueue<String>();
		CircularQueue<Integer> q2 = new CircularQueue<Integer>();

		// ________q1 Test Cases________
		System.out.println("________q1 Test Cases________\n");
		try {
			// The enqueue case where you add an element to an empty queue.
			q1.enqueue("Samuel");
			System.out.println("The first element been enqueued:");
			q1.display();
			System.out.println();

			q1.enqueue("John");
			System.out.println("\n2 elements have been enqueued:");
			q1.display();
			System.out.println();

			/*The general enqueue case (You enqueue an element to a queue that already
			  contains elements)
			  Also the display case where you display a queue that contains elements.*/
			q1.enqueue("Steve");
			q1.enqueue("Jeremy");
			q1.enqueue("Bob");
			System.out.println("\n5 elements have been enqueued:");
			q1.display();
			System.out.println();

			// The only peek case.
			System.out.println("\nThe peek method should return Samuel:");
			System.out.println(q1.peek());

			// The only size case.
			System.out.println("\nThe size method should return 5:");
			System.out.println(q1.size());

			/*The general dequeue case (There is more than one element in the queue before
			  deletion).*/
			q1.dequeue();
			System.out.println("\nDequeue 1 removes Samuel");
			q1.display();
			System.out.println();
			/*Case where you dequeue the final element & where the display method is used
			  when 0 elements are in the queue.*/
			q1.dequeue();
			q1.dequeue();
			q1.dequeue();
			q1.dequeue();
			System.out.println("\nDequeue 5 removes the last element from the list.");
			q1.display();
		} catch (Exception e) {
			System.out.println("The queue is empty.");
		}

		try {
			// Dequeue case where you try to remove an element from a queue that is empty.
			System.out.println("\nDequeue 6 tries to remove an element from an empty queue:");
			q1.dequeue();
		} catch (Exception e) {
			System.out.println("The queue is empty.");
		}

		// ________q2 Test Cases________
		System.out.println("\n________q2 Test Cases________");
		try {
			// The enqueue case where you add an element to an empty queue.
			q2.enqueue(2);
			System.out.println("\nThe first element been enqueued:");
			q2.display();
			System.out.println();

			q2.enqueue(5);
			System.out.println("\n2 elements have been enqueued:");
			q2.display();
			System.out.println();

			// The general enqueue case (You enqueue an element to a queue that already
			// contains elements)
			// Also the display case where you display a queue that contains elements.
			q2.enqueue(7);
			q2.enqueue(1);
			q2.enqueue(23);
			System.out.println("\n5 elements have been enqueued:");
			q2.display();
			System.out.println();

			// The only peek case.
			System.out.println("\nThe peek method should return 2:");
			System.out.println(q2.peek());

			// The only size case.
			System.out.println("\nThe size method should return 5:");
			System.out.println(q2.size());

			/*The general dequeue case (There is more than one element in the queue before
			  deletion).*/
			q2.dequeue();
			System.out.println("\nDequeue 1 removes 2");
			q2.display();
			System.out.println();
			/*Case where you dequeue the final element & where the display method is used
			  when 0 elements are in the queue.*/
			q2.dequeue();
			q2.dequeue();
			q2.dequeue();
			q2.dequeue();
			System.out.println("\nDequeue 5 removes the last element from the list.");
			q2.display();
		} catch (Exception e) {
			System.out.println("The queue is empty.");
		}

		try {
			// Dequeue case where you try to remove an element from a queue that is empty.
			System.out.println("\nDequeue 6 tries to remove an element from an empty queue:");
			q1.dequeue();
		} catch (Exception e) {
			System.out.println("The queue is empty.");
		}
	}
}
