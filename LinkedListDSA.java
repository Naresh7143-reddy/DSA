//SINGLE LINKED LIST

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head = null;

    public void insertatbeginning(int ele) {
        Node newNode = new Node(ele);
        newNode.next = head;
        head = newNode;
    }

    public void insertatend(int ele) {
        Node newNode = new Node(ele);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ---> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void deletebeginning() {
        if (head == null) {
            System.out.println("No list present");
        } else {
            head = head.next;
        }
    }

    public void deleteatend() {
        if (head == null) {
            System.out.println("No list present");
        } else if (head.next == null) {
            head = null;
        } else {
            Node curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    public void insertatany(int pos, int ele) {
        Node newNode = new Node(ele);

        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;

        for (int i = 1; i < pos - 1; i++) {
            if (curr == null) {
                System.out.println("Position out of range");
                return;
            }
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteatany(int pos) {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node curr = head;

        for (int i = 1; i < pos - 1 && curr.next != null; i++) {
            curr = curr.next;
        }

        if (curr.next == null) {
            System.out.println("Position out of range");
            return;
        }

        curr.next = curr.next.next;
    }

    public void search(int ele) {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        Node curr = head;
        int pos = 1;

        while (curr != null) {
            if (curr.data == ele) {
                System.out.println("Found at position " + pos);
                return;
            }
            curr = curr.next;
            pos++;
        }

        System.out.println("Element not found");
    }
}


// CIRCULAR LINKED LIST 

class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int ele) {
        this.data = ele;
        this.next = null;
    }
}

class CircularLinkedList {
    CircularNode head = null;
    CircularNode tail = null;

    public void addfirst(int ele) {
        CircularNode newNode = new CircularNode(ele);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addlast(int ele) {
        CircularNode newNode = new CircularNode(ele);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("No list present");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("No list present");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            CircularNode curr = head;
            while (curr.next != tail) {
                curr = curr.next;
            }
            tail = curr;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        CircularNode curr = head;
        do {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        } while (curr != head);

        System.out.println("(head)");
    }
}


//  DOUBLY LINKED LIST 

class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    public DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {

    DoublyNode head = null;
    DoublyNode tail = null;

    public void addfirst(int ele) {
        DoublyNode newNode = new DoublyNode(ele);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addlast(int ele) {
        DoublyNode newNode = new DoublyNode(ele);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void displayForward() {
        DoublyNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        DoublyNode curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.prev;
        }
        System.out.println("null");
    }
}


public class LinkedListDSA {
    public static void main(String[] args) {

        // Singly
        LinkedList sll = new LinkedList();
        sll.insertatbeginning(10);
        sll.insertatbeginning(20);
        sll.insertatend(30);
        sll.display();

        // Circular
        CircularLinkedList cll = new CircularLinkedList();
        cll.addfirst(10);
        cll.addfirst(20);
        cll.addlast(30);
        cll.display();

        // Doubly
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addfirst(10);
        dll.addfirst(20);
        dll.addlast(30);
        dll.displayForward();
        dll.displayBackward();
    }
}