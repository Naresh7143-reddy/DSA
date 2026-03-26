

class Node{
	int data;
	Node next;

	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
class LinkedList{
	
	Node head=null;
   public void insertatbeginning(int ele){

	Node newNode=new Node(ele);
	if(head==null){
		head = newNode ;
	}
	else{
		newNode.next=head;
		head=newNode;
	}
   }
	public void insertatend (int ele)
	{
		Node newNode = new Node(ele);
		if(head==null){
			head=newNode;
		}
		else{
			Node curr = head;
			while(curr.next!=null){
				curr=curr.next;
			}
			curr.next=newNode;
		}
	}
	public void display(){
		Node curr=head;
		while(curr.next!=null){
			System.out.print(curr.data+ "--->");
			curr=curr.next;
		}
		System.out.print("null");


	}

	public void deletebegging(){
		if(head==null){
			System.out.print("not linked list present ");
		}
		else{
			head=head.next;
		}
	}

	public void deleteatend(){
		if(head==null){
			System.out.print("not linked list present ");
		}
		else{
			Node curr = head;

			while(curr.next.next!=null){
				curr=curr.next;
			}
			curr.next=null;
		}

	}
	public void deleteatany(int pos){
		if (head==null){
			System.out.print("nothing to delete ");
			return ;
		}
		if(pos==1){
			head=head.next;
			return ;
		}

		Node curr =head;
		// if next node doesn't exist
    if (curr.next == null) {
        System.out.println("Position out of range");
        return;
    }

		for(int i=1;i<pos-1&& curr.next!=null;i++){
			curr=curr.next;
		}
		curr.next=curr.next.next;
	}

	public void insertatany(int pos , int ele){
		
		Node newNode = new Node(ele);

		if(pos==1){
			newNode.next=head;
			head=newNode;
			return ;
		}

		Node curr = head;

		for(int i=1;i<pos-1;i++){
			if (curr==null){
				System.out.print("postion out of range");
				return ;
			}
		}

		newNode.next=curr.next;
		curr.next=newNode;

	}

	public void Searchlist(int ele){
		if(head.data==ele){
			System.out.print("Found at pos 1");
		}
		
		Node curr = head;
		int pos =1;
		while(curr!=null){
			if(curr.data==ele){
				System.out.print("found element"+"   " +curr.data+ "    " + "at position"+ " "+pos);
				return ;
			}
			curr=curr.next;
			pos++;
		}
		 System.out.println("Element not found");
		
	}
}

class CircularNode{
	int data;
	CircularNode next;

    CircularNode(int ele) {
		this.data=ele;
		this.next=null;
    }
	
}

class CircularLinkedList{
	CircularNode head= null;
	CircularNode tail= null;

	public void addfirst(int ele){
		CircularNode newNode= new CircularNode(ele);
		if(head==null){
			head=newNode;
			tail=newNode;
			tail.next=head;

		}
		else{
				newNode.next=head;
				head=newNode;
				tail.next=head;
		}
	}


	public void addlast(int ele)
	{
		CircularNode newNode = new CircularNode(ele);
		if(head==null){
			head=newNode;
			tail=newNode;
			tail.next=head;
		}
		else{
			 tail.next = newNode; // link old tail to new
        	tail = newNode;      // move tail
        	tail.next = head;
	}   
	}

	public void deletefirst(){
		if(head==null){
			System.out.print("there is no linked list present ");
		}
		else{
			head=head.next;
			tail.next=head;
		}
	}

	public void deletelast(){
		if(head==null){
			System.out.print("there is no linked list present ");
		}
		else{
			CircularNode curr = head;
			while(curr.next!=tail){
				curr=curr.next;
				tail=curr;
				tail.next=head;
			}
		}
	}

	public void display(){
		CircularNode curr=head;
		do { 
			System.out.print(curr.data+"-->");
			curr=curr.next;
		} while (curr!=head);
	}

	public void Searchlist(int ele){
		if(head.data==ele){
			System.out.print("Found at pos 1");
		}
		
		CircularNode curr = head;
		int pos =1;
		do { 
			if(curr.data==ele){
				System.out.print("element found at "+ pos);
				return ;
			}
			curr=curr.next;
			pos++;
		} while (curr!=head);
		 System.out.println("Element not found");
		
	}
}

//// doubly circular linked list

class DoublyNode{
	int data;
	DoublyNode prev;
	DoublyNode next;

    public DoublyNode(int data, DoublyNode prev, DoublyNode next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class DoublyLinkedList{

	DoublyNode head= null;
	DoublyNode tail=null;

	public void addfirst(int ele){

			DoublyNode newNode = new DoublyNode(ele, null, head);

			if(head==null){
				head=newNode;
				tail=newNode;
			}
			else{
				head.prev = newNode;
        		head = newNode;
			}
	}

	
	public void addlast(int ele){

			DoublyNode newNode = new DoublyNode(ele, tail, null);

			if(head==null){
				head=newNode;
				tail=newNode;
			}
			else{
				tail.next = newNode;
        		tail = newNode;

			}
	}


	public void deleteFirst() {
    if (head == null) {
        System.out.println("List is empty");
    } 
    else if (head == tail) { 
        head = null;
        tail = null;
    } 
    else {
        head = head.next;
        head.prev = null;
    }
}


public void deleteLast() {
    if (head == null) {
        System.out.println("List is empty");
    } 
    else if (head == tail) { 
        head = null;
        tail = null;
    } 
    else {
        tail = tail.prev;
        tail.next = null;
    }
}


public void displayforward(){
	DoublyNode curr =head;
	while(curr.next!=null){
		System.out.print(curr.data+" -->");
		curr=curr.next;
	}
}

public void backtraverse(){

	DoublyNode curr = tail;
	while(curr!=head){
		System.out.print(curr.prev+" <--");
		curr=curr.prev;
	}
}
}




// CIRCULAR lINKED lIST 
public class Main{
	public static void main(String[] args) {
		CircularLinkedList cl= new CircularLinkedList();
		DoublyLinkedList dl= new DoublyLinkedList();
		
	}
}


