/**
* CS 111 Section No. 002
* Lab Assignment 10
* Samuel Harris **/

public class CircularQueue<T> {
	private static class Node<T> {
		private T data;
		private Node<T> next;

		private Node(T d) {
			data = d;
			next = null;
		}

		private Node(T d, Node<T> ref) {
			data = d;
			next = ref;
		}
	}

	private Node<T> tail;
	private int numEle;

	public CircularQueue() {
		tail = null;
		numEle = 0;
	}

	//Add an element to the end of the queue.
	public void enqueue(T value) {
		Node<T> tempNode = new Node<T>(value);

		if (numEle == 0) {
			tail = tempNode;
			tail.next = tail;
		} else {
			tempNode.next = tail.next;
			tail.next = tempNode;
			tail = tempNode;
		}
		numEle++;
	}

	//Remove an element from the beginning of the queue.
	public void dequeue()throws Exception {
		if (numEle == 0) {
			throw new Exception("Queue Empty");
		} else if (numEle == 1) {
			tail = null;
			numEle--;
		} else {
			Node<T> firstNode = tail.next;
			tail.next = firstNode.next;
			numEle--;
		}
	}

	//Display all of the elements in the queue.
	public void display()throws Exception {
		if (numEle == 0) {
			throw new Exception("Queue Empty");
		} else if (numEle > 0) {
			Node<T> firstNode = tail.next;
			for (int i = 0; i < numEle; i++) {
				System.out.print(firstNode.data + " ");
				firstNode = firstNode.next;
			}
		}
	}

	//Return the first element in the queue, but do not remove the that element.
	public T peek() {
		return (tail.next.data);
	}

	//Return the size of the queue.
	public int size() {
		return numEle;
	}
}
