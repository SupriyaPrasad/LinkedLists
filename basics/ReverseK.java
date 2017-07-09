package LinkedList;

public class ReverseK {
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
	public Node reverseKElements(Node head, int k) { 
		Node prev=head;
		Node temp=head.next;
		Node nextnode=head;
		while(temp.next!=null){
			System.out.println(prev.data+" head");
			int j=1;
			while(j<k && temp.next!=null){
				nextnode=temp.next;
				System.out.println(temp.data);
				temp.next=prev;
				prev=temp;
				temp=nextnode;
				j++;
		}
			if(temp.next==null && j!=k){
				System.out.println(temp.data);
				temp.next=prev;
				System.out.println("end");
				prev=temp;
				break;
			}
			if(temp.next==null && j==k){
				System.out.println("end");
				break;
			}
			else{
			prev=nextnode;
			temp=temp.next;
			}
		}
		head.next=null;
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseK r = new ReverseK();
		int count=9;
		for(int i=1;i<=count;i++){
			r.insertEnd(i);
		}
		r.reverseKElements(r.head, 3);
		//r.display(r.head);
		
	}

}
