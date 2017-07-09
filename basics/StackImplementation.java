package LinkedList;

public class StackImplementation {
	Node head;

	public Node push(int n){
		if(head==null){
		Node first= new Node();
		first.data=n;
		first.next=null;
		head=first;
		}else{
			Node temp=head;
			Node node= new Node();
			node.data=n;
			node.next=temp;
			head=node;
		}
		return head;
	}
	public Node pop(){
		Node temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	public void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		StackImplementation s= new StackImplementation();
		int count=5;
		for(int i=1;i<=count;i++){
			s.push(i);
		}
		s.display(s.head);
		int num_pop=2;
		for(int i=1;i<=num_pop;i++){
			s.pop();
		}
		s.display(s.head);

	}

}
