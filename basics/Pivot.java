package LinkedList;

public class Pivot {
	
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
	
	public Node divideLLOnPivot(int pivot,Node head){
		Node temp=head;
		Pivot p1= new Pivot();
		Pivot p2=new Pivot();
		while(temp!=null){
			if(temp.data<=pivot){
				p1.insertInEnd(temp.data);
			}
			else{
				p2.insertInEnd(temp.data);
			}
			temp=temp.next;
		}
		System.out.print("L1:");
		p1.display(p1.head);
		System.out.print("L2:");
		p2.display(p2.head);
		return head;
	}
	
	public void display(Node head) {
		Node temp = head;
		while (temp!= null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pivot p= new Pivot();
		p.insertInEnd(1);
		p.insertInEnd(2);
		p.insertInEnd(9);
		p.insertInEnd(8);
		p.insertInEnd(3);
		p.insertInEnd(5);
		p.insertInEnd(7);
		p.insertInEnd(6);
	
		p.divideLLOnPivot(3, p.head);
	}
	

}
