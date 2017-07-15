package LinkedList;

public class PalindromTraversal {
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
	public Node reversal(Node head){
		Node prev=head;
		Node nn=head;
		int len=length(head);
		int mid=0;
		int i=0;
		if(len%2==0){
			mid=len/2;
		}else{
			mid=(len/2)+1;
		}
		while(i<mid){
			prev=prev.next;
			i++;
		}
		Node temp=prev;
		Node last=prev.next;        
		while(last!=null){
		
			nn=last.next;	
			last.next=prev;
			
			prev=last;
			last=nn;
			
		}
		temp.next=null;
		traversal(head,prev);
		return head;
	}
	public Node traversal(Node head,Node head2){
		Node temp=head;
		Node last=head2;
		Node sec=temp.next;
		Node prev=last.next;
		while(prev!=null){
			sec=temp.next;
			prev=last.next;
			temp.next=last;
			last.next=sec;
			last=prev;
			temp=sec;
		}
		temp.next=null;
		display(head);
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
	
	public int length(Node head) {
		int len=0;
		Node temp = head;
		while (temp != null) {
			len++;
			temp = temp.next;
		}
		return len;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromTraversal l= new PalindromTraversal();
		int count=9;
		for(int i=1;i<=count;i++){
			l.insertInEnd(i);	
		}	
		l.display(l.head);
		l.reversal(l.head);
	}

}
