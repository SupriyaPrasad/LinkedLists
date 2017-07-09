package LinkedList;


public class Palindrome {
	
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
	public Node reverseLL(Node head) {
		Node temp = head.next;
		Node prev = head;
		Node nextnode = null;
		while (temp.next != null) {
			nextnode = temp.next;

			temp.next = prev;
			prev = temp;
			temp = nextnode;

		}
		temp.next = prev;
		Node tail = temp;
		return tail;
	}
	
	public void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public boolean checkPalindrome(Node head){
		Node temp=this.head;
		boolean b=false;
		int mid=0;
		int j=0;
		int len=length(temp);
		if(len%2==0){
			mid=len/2;
		}else{
			mid=(len/2)+1;
		}
		for(int i=0;i<mid-1;i++){
			temp=temp.next;
		}
		Node tail=reverseLL(temp);
		Node first=head;
		Node last=tail;
		while(j<mid){
			if(first.data==last.data){
				b=true;
				j++;
				first=first.next;
				last=last.next;
			}else{
				return false;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome l1= new Palindrome();
		l1.insertEnd(1);
		l1.insertEnd(2);
		l1.insertEnd(6);
		l1.insertEnd(2);
		l1.insertEnd(1);
		System.out.println(l1.checkPalindrome(l1.head));

	}

}
