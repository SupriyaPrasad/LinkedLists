package LinkedList;

public class MergeSortedLL {
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
	public  Node removeFirst(Node head){
		if(head==null){
			return null;
		}
		else{
			Node temp=head;
			Node new_head=temp.next;
			head=new_head;
			temp.next=null;
		}
		return head;
	}
	
	/*public  Node mergeLL(Node head1, Node head2){
		int len1=length(head1);
		int len2=length(head2);
		Node start=null;
		if(len1>=len2){
			start=mergeLL2(head1,head2);
		}
		else{
			start=mergeLL2(head2,head1);
		}
		display(start);
		return start;
		}*/

	public  Node mergeLL2(Node head1, Node head2){
		MergeSortedLL res= new MergeSortedLL();
		
		Node one=head1;
		Node two=head2;
		Node temp=res.head;
		
		if(head1.data<head2.data){
			res.head=head1;
			temp=res.head;
			one=one.next;
		}
		else{
			res.head=head2;
			temp=res.head;
			two=two.next;
		}
		
		Node main_head=res.head;
		while(one!=null && two!=null){
			if(one.data<=two.data){
				temp.next=one;
				one=one.next;
				temp=temp.next;
			}
			else if(two.data<one.data){
				temp.next=two;
				two=two.next;
				temp=temp.next;
			}
		}
		if(one==null){
			temp.next=two;
		}
		else if(two==null){
			temp.next=one;
		}
			
			display(main_head);
			return main_head;
	}
		/*Node one=head1;
		Node two=head2;
		Node prev=head1;
		
		while(one!=null && two!=null){
			while(two.data>=one.data ){
				prev=one;
				one=one.next;
			}
			if(two!=null && two.data<one.data){
				prev.next=two;
				Node newHead= removeFirst(head2);
				two.next=one;
				one=two;
				head2=newHead;
				two=head2;
				
			}
		}
		return head1;
	}*/
	public  int length(Node head) {
		Node temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
		}

	public  void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedLL m= new MergeSortedLL();
		MergeSortedLL m2= new MergeSortedLL();
		
		m.insertEnd(10);
		m.insertEnd(20);
		m.insertEnd(30);
		m.insertEnd(40);
		m.insertEnd(50);
		
		m2.insertEnd(15);
		m2.insertEnd(22);
		m2.insertEnd(27);
		m2.insertEnd(39);
		
		m.mergeLL2(m.head,m2.head);
	}

	}


