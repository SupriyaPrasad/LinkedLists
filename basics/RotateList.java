package LinkedList;

public class RotateList {
	Node head; 
	
	public Node insertEnd(int n){
		if(head==null){
			Node first= new Node();
			first.data=n;
			first.next=null;
			head=first;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			Node node= new Node();
			temp.next=node;
			node.data=n;
			node.next=null;
			
		}
		return head;
	}
	
	public int length(Node head) {
		Node temp = this.head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	public void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public Node rotateRight(Node head,int b){
		Node main=head;
		Node temp=head;
		int i=1;
		int len=length(head);
		while(i<len-b){
			temp=temp.next;
			i++;
		}
		Node sec=temp.next;
		temp.next=null;
		System.out.println(sec.data);
		head=sec;
		Node last=sec;
		while(last.next!=null){
			last=last.next;
		}
		System.out.println(last.data);
		last.next=main;
		display(sec);
		
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateList r= new RotateList();
		r.insertEnd(1);
		r.insertEnd(2);
		r.insertEnd(3);
		r.insertEnd(4);
		r.insertEnd(5);
		
		r.rotateRight(r.head, 2);
	}

}
