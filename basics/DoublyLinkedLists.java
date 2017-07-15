package LinkedList;

public class DoublyLinkedLists {
	DNode head;

	public DNode insertStart(int n){
		if(head==null){
			DNode first= new DNode(n);
			head=first;
			//System.out.println(head.data);
		}
		else{
			DNode temp=head;
			DNode first= new DNode(n);
			first.prev=null;
			first.next=temp;
			temp.prev=first;
			head=first;
		}
		return head;
	}
	
	public DNode insertEnd(int n){
		if(head==null){
			DNode first= new DNode(n);
			first.prev=null;
			first.next=null;
			head=first;
		}
		DNode temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		DNode node= new DNode(n);
		temp.next=node;
		node.prev=temp;
		node.next=null;

		return head;
	}
	
	public DNode insertPos(int n, int pos){
		DNode temp=head;
		int count=1;
		if(pos==1){
			insertStart(n);
		}
		else if(pos<length(head)){
			while(count<pos-1){ 
				temp=temp.next;
				count++;
		}
		DNode sec=temp.next;
		DNode node= new DNode(n);
		temp.next=node;
		node.prev=temp;
		node.next=sec;
		sec.prev=node;
		}
		else if(pos==length(head)){
			insertEnd(n);
		}
		else{
			System.out.println("max allowed position is:"+length(head));
		}
		return head;
	}
	public DNode deleteAny(int pos){
		DNode temp=head;
		DNode first=head;
		DNode node=head;
		DNode sec=head;
		if(pos==1){
			temp=temp.next;
			first.next=null;
			temp.prev=null;
			head=temp;
		}
		else if(pos<length(head)){
			int i=1;
			while(i<pos-1){
				first=first.next;
				i++;
			}
			node=first.next;
			sec=first.next.next;
			first.next=sec;
			sec.prev=first;
			node.next=null;
			node.prev=null;
		}
		else if(pos == length(head)){
            DNode last=head;
			while(last.next.next!=null){
				last=last.next;
			}
			node=last.next;
			last.next=null;
			node.prev=null;
			
		}
		return node;
	}
	
	public int length(DNode head){
		int len=0;
		DNode temp=head;
		while(temp!=null){
			temp=temp.next;
			len++;
		}
		return len;
	}
	
	public DNode display(DNode head){
		DNode temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}System.out.println();
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedLists d = new DoublyLinkedLists();
		int count=7;
		for(int i=1;i<=count;i++){
			d.insertStart(i);
		}
		d.insertEnd(9);
		d.insertPos(233, 8);
		
		d.deleteAny(9);
		
		System.out.println(d.length(d.head)+"length");
		d.display(d.head);
	}

}
