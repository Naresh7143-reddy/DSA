// STACK FOR ARRAY

class Stack {
    int [] st ;
    int top=-1;
    
    Stack(int n){
        st=new int[n];
    }
    
    void push(int ele){
        
        if(isFull()){
            System.out.print("stack is full");
            return ;
        }
        st[++top] =ele;
    }
    int pop(){
        if(isEmpty()){
            System.out.print("the stack is empty");
            return 1;
        }
        return st[top--];
    }
    int peak(){
        return st[top] ;
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==st.length-1;
    }
}



class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class StackLL{
    Node top = null;
    void push(int ele){
        Node newNode = new Node(ele);
            if(top==null){
                top=newNode;
            }
            else{
                newNode.next=top;
                top=newNode;
            }
    }

    int pop(){
        if(isEmpty()){
            System.out.print("it is empty");
            return 0;
        }
        int del= top.data;
        top=top.next;
        return del;
    }

    int peek(){
        if(isEmpty()){
            System.out.print("it is empty");
            return 0;
        }
        return top.data;
    }

    boolean isEmpty(){
        return top==null;
    }
}



public class StackDsa
{
	public static void main(String[] args) {
	   

        Stack s= new Stack(10);
        s.push(10);
        s.push(70);

        s.pop();
        s.peak();
        StackLL ll = new StackLL();
        ll.push(90);
        ll.push(40);
        ll.pop();
        ll.peek();

	    
	}
}