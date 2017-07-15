package LinkedList;

public class CircularLinkedLists {
	
	CNode head;
	
	public CNode insertStart(int n){
		if(head==null){
			CNode first= new CNode(n);
			head=first;
		}
		else{
			CNode temp=head;
			CNode sec=head.next;
			if(head.next==head){
				CNode node=new CNode(n);
				
				head.next=node;
				node.next=head;
				head=node;
			}
			else{ 
				while(sec.next!=head){
				sec=sec.next;
				}
				CNode node=new CNode(n);
				sec.next=node;
				node.next=temp;
				head=node;
		}
		}
		return head;
	}
	
	public CNode display(CNode head){
		CNode temp=head;
		CNode sec=head.next;
		System.out.print(temp.data);
		while(sec!=temp){
			System.out.print(sec.data);
			sec=sec.next;
		}System.out.println();
		return head;
	}

	public static void main(String[] args) {
		CircularLinkedLists c= new CircularLinkedLists();
		int count=6;
		for(int i=1;i<=count;i++){
			c.insertStart(i);
		}
		c.display(c.head);
	}

}
