package LinkedList;

public class Reverse_LinkedLists {
	int data;
	Reverse_LinkedLists next;
	Reverse_LinkedLists head;

	public void insertEnd(int num) {
		if (head == null) {
			Reverse_LinkedLists temp = new Reverse_LinkedLists();
			temp.data = num;
			temp.next = null;
			head = temp;
		} else {
			Reverse_LinkedLists temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			Reverse_LinkedLists node = new Reverse_LinkedLists();
			temp.next = node;
			node.data = num;
			node.next = null;
		}
		// return head;
	}

	public void display() {
		Reverse_LinkedLists temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public void reverseLL() {
		Reverse_LinkedLists temp = head;
		Reverse_LinkedLists prev = null;
		Reverse_LinkedLists nextnode = null;
		while (temp.next != null) {
			nextnode = temp.next;
			temp.next = prev;
			prev = temp;
			temp = nextnode;
		}
		temp.next = prev;
		head = temp;

		// return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_LinkedLists l1 = new Reverse_LinkedLists();
		l1.insertEnd(1);
		l1.insertEnd(3);
		l1.insertEnd(4);
		l1.insertEnd(5);
		l1.insertEnd(3);
		// l1.display();
		l1.display();
		l1.reverseLL();
		l1.display();
	}

}