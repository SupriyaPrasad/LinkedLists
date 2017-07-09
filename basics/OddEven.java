package LinkedList;

public class OddEven {
	Node head;

	public Node insertEnd(int n) {
		if (head == null) {
			Node first = new Node();
			first.data = n;
			first.next = null;
			head = first;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			Node node = new Node();
			temp.next = node;
			node.data = n;
			node.next = null;
		}
		return head;
	}

	public void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public String checkOddEven(Node head) {
		Node temp = head;
		String res = null;
		while (temp != null) {
			if (temp.next == null) {
				res = "Odd";
				return res;
			}
			if (temp.next.next == null) {
				res = "Even";
				return res;
			}

			temp = temp.next.next;
		}

		return res;
	}

	public static void main(String[] args) {
		OddEven o = new OddEven();
		int count = 2;
		for (int i = 1; i <= count; i++) {
			o.insertEnd(i);
		}
		System.out.println(o.checkOddEven(o.head));
	}

}
