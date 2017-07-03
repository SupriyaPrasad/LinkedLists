package LinkedList;

import java.util.Random;

import javax.print.StreamPrintService;


public class LinkedList_class {
	public int data;
	public LinkedList_class next;
	
	static LinkedList_class start= new LinkedList_class();
	static LinkedList_class temp= new LinkedList_class();
	
	public static void insert_atStart(int num){
		temp=start;
		LinkedList_class node= new LinkedList_class();
		temp.next=node;
		node.data=num;
		
	}
	public void insert_atEnd(int num, LinkedList_class start){
		temp=start;
		if(start==null){
			System.out.println("list is empty");
		}else{
			while(temp.next!=null){
				temp=temp.next;
			}
			LinkedList_class node= new LinkedList_class();
			temp.next=node;
			node.data=num;
		}
	}
	
	public static void display(LinkedList_class start){
			temp=start.next;
			while(temp!=null){
				System.out.print(temp.data);
				temp=temp.next;
			}	
		System.out.println();
	}
	
	public static int length(){
		temp=start.next;
		int size=0;
		while(temp!=null){
			size++;
			temp=temp.next;
		}
		return size;
	}
	
	public void print_alternate(LinkedList_class start){
		temp=start.next;
		while(temp!=null && temp.next!=null){
			System.out.print(temp.data);
			temp=temp.next.next;
		}
		System.out.println();
	}
	
	public static int print_middle_number(int length){
		temp=start.next;
		int mid=length/2;
		for(int i=0;i<mid;i++){
			temp=temp.next;
		}
		return temp.data;
	}
	
	public static void removeAll_from_last(){//need to check
		while(temp!=null){
			temp=start.next;
			while(temp.next.next!=null ){
				temp=temp.next;
			}
				System.out.println(temp.next.data);
				temp.next=null;
			}
		}
	
	public void reverse_list(LinkedList_class start){
		LinkedList_class prev = new LinkedList_class();
		temp=start;
		
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
		temp=null;
		
	}
	
	public static boolean check_palindrome(){
		 int length=length();
		 int mid=length/2;
		 boolean b= false;
		 System.out.println(length+" len");
		 System.out.println(mid+" mid");
		 temp=start.next;
		 for(int i=0;i<(length-2);i++){
			 temp=temp.next;
		 }
		 
		 System.out.println("last_val="+temp.next.data);
		 System.out.println("prev_val="+temp.data);
		 LinkedList_class prev=temp;
		 LinkedList_class last_val=temp.next;
		 temp=start.next;
		 for(int i=0;i<mid;i++){
			 System.out.println(temp.data+" temp");
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
				 
			 }System.out.println(prev.data+" prev");
		 }
		 
		 
		 return b;
	}
	public static void addition(LinkedList_class l1, LinkedList_class l2){
		LinkedList_class add_list = new LinkedList_class();
		LinkedList_class head=add_list;
		LinkedList_class cur=head;
		LinkedList_class h1=l1.next;
		LinkedList_class h2=l2.next;
		
		while(h1!=null || h2!=null){	
			int sum=h1.data+h2.data;
			add_list.insert_atEnd(sum,cur);
			h1=h1.next;
			h2=h2.next;	
			cur=cur.next;	
		}
		cur=head;
		
		add_list.reverse_list(cur);
	}
	
		 
		 
	

	public static void main(String[] args) {
		int count=5;
		//Random r=new Random();
		/*for(int i=0;i<count;i++){
			insert_atEnd(r.nextInt(count));
		}*/
		LinkedList_class l3= new LinkedList_class();
		for(int i=0;i<count;i++){
			l3.insert_atEnd(i,l3);
		}
		
		LinkedList_class a = l3.next;
		
		while(a.next!=null){
			System.out.println(a.data);
			a=a.next;
		}System.out.println();
		
		
		l3.print_alternate(l3);
		/*insert_atEnd(1);
		insert_atEnd(2);
		insert_atEnd(3);
		insert_atEnd(3);
		insert_atEnd(2);
		insert_atEnd(1);
		insert_atEnd(1);
		insert_atEnd(1);*/
		
		//display();
		//print_alternate();
		//int len=length();
		//System.out.println("length is "+len);
		//print_middle_number(len);
		//reverse_list();
		//System.out.println(check_palindrome());
		/*LinkedList_class l1= new LinkedList_class();
		//System.out.println(l1);
		LinkedList_class l2= new LinkedList_class();
		//System.out.println(l2);
		l1.insert_atEnd(0,l1);
		l1.insert_atEnd(0,l1);
		l1.insert_atEnd(1,l1);
		
		l2.insert_atEnd(0,l2);
		l2.insert_atEnd(0,l2);
		l2.insert_atEnd(2,l2);
		//addition(l1,l2);*/
		
	}

}
