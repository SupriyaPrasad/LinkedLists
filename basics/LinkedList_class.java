package LinkedList;

import java.util.Random;


public class LinkedList_class {
	 int data;
	 LinkedList_class next;
	 LinkedList_class start;
	
	public  void insert_atStart(int num){
		LinkedList_class temp=start;
		LinkedList_class node= new LinkedList_class();
		temp.next=node;
		node.data=num;
		
	}
	public LinkedList_class insert_atEnd(int num){
		
		if(start==null){
			LinkedList_class node= new LinkedList_class();
			node.data=num;
			node.next=null;
			start=node;
		}
		else{
			LinkedList_class temp=start;
			while(temp.next!=null){
				temp=temp.next;
			}
			LinkedList_class node= new LinkedList_class();
			temp.next=node;
			node.data=num;
		}
		return start;
	}
	
	public void display(){
		LinkedList_class temp=start;
			while(temp!=null){
				System.out.print(temp.data);
				temp=temp.next;
			}	
		System.out.println();
	}
	
	public int length(){
		LinkedList_class temp=start;
		int size=0;
		while(temp!=null){
			size++;
			temp=temp.next;
		}
		return size;
	}
	
	public void print_alternate(){
		LinkedList_class temp=start;
		while(temp!=null){
			System.out.print(temp.data);
			if(temp.next!=null && temp.next.next!=null){
				temp=temp.next.next;
			}
			else{
				break;
			}
		}
		System.out.println();
	}
	
	public int print_middle_number(int length){
		LinkedList_class temp=start;
		int mid=length/2;
		for(int i=0;i<mid;i++){
			temp=temp.next;
		}
		return temp.data;
	}
	
	public void removeAll_from_last(){//need to check
		LinkedList_class temp=start;
		while(temp!=null){
			temp=start.next;
			while(temp.next.next!=null ){
				temp=temp.next;
			}
				System.out.println(temp.next.data);
				temp.next=null;
			}
		}
	
	public void reverse_list(){
		LinkedList_class prev = new LinkedList_class();
		LinkedList_class temp=start;
		
		LinkedList_class new_start = new LinkedList_class();
		
		while(temp.next!=null){
			temp=temp.next;
		}
		new_start=temp;
		
		while(temp!=start){
			prev=start;
			while(prev.next!=temp ){
				prev=prev.next;
				}
				System.out.print(temp.data);
				temp.next=prev;
				temp=prev;	
		}
		System.out.println(start.data);
		temp=null;	
	}
	
	public boolean check_palindrome(){
		 LinkedList_class temp=start;
		 int length=length();
		 int mid=length/2;
		 boolean b= false;
		 temp=start;
		 for(int i=0;i<length-2;i++){
			 temp=temp.next;
		 }
		 LinkedList_class prev=temp;
		 LinkedList_class last_val=temp.next;
		 temp=start;
		 for(int i=0;i<mid;i++){
			 if(temp.data==last_val.data){
				 b=true;
			 }else{
				 b=false;
				 break;
			 }
			 temp=temp.next;
			 last_val.next=prev;
			 last_val=prev;
			 prev=start.next;
			 while(prev.next!=last_val){
				 prev=prev.next;
				 
			 }
		 }
		 return b;
	}
	
	public static void addition(LinkedList_class p1, LinkedList_class p2){
		LinkedList_class add_list = new LinkedList_class();
		LinkedList_class head=add_list;
		LinkedList_class cur=head;
		LinkedList_class h1=p1;
		LinkedList_class h2=p2;
		while(h1!=null || h2!=null){
			int sum=h1.data+h2.data;
			cur= add_list.insert_atEnd(sum);
			h1=h1.next;
			h2=h2.next;	
			cur=cur.next;	
		}
		cur=head;
		
		add_list.reverse_list();
	}
	
	
	public static void main(String[] args) {
		int count=10;
		
		//To Insert Random number
		/*LinkedList_class l3= new LinkedList_class();
		Random r=new Random();
		for(int i=0;i<count;i++){
			l3.insert_atEnd(r.nextInt(10),l3);
		}*/
			
		// To test alternate numbers
		
		LinkedList_class l3= new LinkedList_class();
		for(int i=0;i<count;i++){
			l3.insert_atEnd(i);
		}
		//display elements in LL and display alternate numbers
		l3.display();
		l3.print_alternate();
		
		// Length and middle number
		
		int len=l3.length();
		System.out.println("length is "+len);
		System.out.println("middle number is "+l3.print_middle_number(len));
		l3.reverse_list();
		
		
		//Test Palindrome
		
		LinkedList_class k1= new LinkedList_class();
		 
			k1.insert_atEnd(1);
			k1.insert_atEnd(2);
			k1.insert_atEnd(3);
			k1.insert_atEnd(3);
			k1.insert_atEnd(2);
			k1.insert_atEnd(1);
			
			System.out.println("k1 Palindrome? "+k1.check_palindrome());
		
			
		// Reverse Addition
		
		LinkedList_class l1= new LinkedList_class();
		LinkedList_class l2= new LinkedList_class();
		l1.insert_atEnd(9);
		l1.insert_atEnd(0);
		LinkedList_class head1= l1.insert_atEnd(1);
		l1.display();
		l2.insert_atEnd(9);
		l2.insert_atEnd(0);
		LinkedList_class head2 = l2.insert_atEnd(2);
		l2.display();
		addition(head1,head2);
		
	}

}
