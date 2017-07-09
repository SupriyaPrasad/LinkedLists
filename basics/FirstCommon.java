package LinkedList;

public class FirstCommon {
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

	public Node combine(int n, Node head1, Node head2) {
		Node temp_1 = head1;
		Node temp_2 = head2;
		while (temp_1.next != null) {
			temp_1 = temp_1.next;
		}
		while (temp_2.next != null) {
			temp_2 = temp_2.next;
		}
		Node node = new Node();
		node.data = n;
		temp_1.next = node;
		temp_2.next = node;
		node.next = null;

		return head;
	}
	public int length(Node head) {
		Node temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public int checkCommonNode(Node head1, Node head2) {
		int len1=length(head1);
		int len2=length(head2);
		Node temp;
		Node temp2;
		int diff=0;
		if(len1>len2){
			diff=len1-len2;
			temp=head1;
			for(int i=0;i<diff;i++){
				temp=temp.next;
			}
			temp2=head2;
			}
		else if(len2>len1){
			diff=len2-len1;
			temp=head2;
			for(int i=0;i<diff;i++){
				temp=temp.next;
			}
			temp2=head1;
		}else{
			temp=head1;
			temp2=head2;
		}
		
		while(temp.next!=null){
			if(temp==temp2){
				return temp.data;
			}else{
				temp2=temp2.next;
			}
			temp=temp.next;
		}
		System.out.println(temp.data);
		return temp.data;
	}

	public static void main(String[] args) {
		FirstCommon f1 = new FirstCommon();
		FirstCommon f2 = new FirstCommon();
		f1.insertEnd(1);
		f1.insertEnd(2);
		//f1.insertEnd(3);
		//f1.insertEnd(4);

		f2.insertEnd(1);
		f2.insertEnd(3);
		f1.combine(6, f1.head, f2.head);
		
		
		f1.insertEnd(8);
		f2.insertEnd(9);
		System.out.print("LL1:");
		f1.display(f1.head);
		System.out.print("LL2:");
		f1.display(f2.head);
		System.out.println("Common node "+f1.checkCommonNode(f1.head,f2.head));
	}

}
