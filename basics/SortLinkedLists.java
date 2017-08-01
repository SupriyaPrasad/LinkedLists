package LinkedList;

public class SortLinkedLists {
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
	public Node sortLL(Node head){
		
		Node temp=head;
		Node prev=null;
		Node prevTempNode=null;
		Node prevMinNode=null;
		
		Node minNode=null;
		Node sec=null;
		while(temp.next!=null){
			int min=temp.data;
			prev=temp;
			sec=temp.next;
			int count=0;
			while(sec!=null){
				if(sec.data<min){
					count++;
					min=sec.data;
					prevMinNode=prev;
					minNode=sec;
				}
				prev=sec;
				sec=sec.next;
			}
			
			if(temp.next!=null && count==0){
				prevTempNode=temp;
				temp=temp.next;
			}
			else if(temp.next!=null && count!=0){
				Node nextNode=minNode.next;
				if(temp.next==minNode){
					minNode.next=temp;
				}
				else{
				minNode.next=temp.next;
				prevMinNode.next=temp;
				}
				temp.next=nextNode;
				
				
				if(temp==head && minNode!=null){
					prevTempNode=temp;
					this.head=minNode;
				}
				else if(temp!=head && minNode!=null){
					prevTempNode.next=minNode;
				}
				prevTempNode=minNode;
				temp=minNode.next;
				}
			
			else if(temp!=head && minNode!=null){
				prevTempNode.next=minNode;
			}
			
		}
		display(this.head);
		return this.head;
	}
	
	public  void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortLinkedLists s= new SortLinkedLists();
			
			s.insertEnd(10);
			s.insertEnd(3);
			s.insertEnd(4);
			s.insertEnd(9);
			s.insertEnd(6);
			s.insertEnd(5);
			s.insertEnd(7);
			s.insertEnd(2);
			s.insertEnd(1);
			s.sortLL(s.head);
		}

	}


