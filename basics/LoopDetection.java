package LinkedList;

public class LoopDetection {
	Node head;
	
	public Node insertInEnd(int n){
		Node temp= head;
		if(head==null){
			Node first= new Node();
			first.data=n;
			first.next=null;
			head=first;
		}
		else {
			while (temp.next != null) {
				temp = temp.next;
			}
			Node node = new Node();
			temp.next = node;
			node.data = n;
		}
		return head;
	}
	public Node insertInLoop(int pos){
		int i=1;
		Node temp=head;
		Node sec=head;
		while(i!=pos){
			temp=temp.next;
			i++;
		}
		while(sec.next!=null){
			sec=sec.next;
		}
		sec.next=temp;
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
	
	public boolean check_loop(Node head){
		Node fast=head;
		Node slow=head;
		boolean b=false;
		while(fast.next.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				b=true;
				System.out.println(returnLoopStart(head,slow));
				return true;
				
			}
			if(fast.next==null){
				System.out.println("no loop");
				b=false;
				return false;
			}
		}	
		return b;
	}
	
	public int returnLoopStart(Node head, Node pos){
		Node temp=head;
		while(temp!=pos){
			temp=temp.next;
			pos=pos.next;
		}
		return pos.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopDetection l= new LoopDetection();
		int count=7;
		for(int i=1;i<=count;i++){
			l.insertInEnd(i);	
		}
			l.insertInLoop(3);
			l.check_loop(l.head);
	}

}
