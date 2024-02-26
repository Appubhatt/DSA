package cprogramming;
//Find GCD and LCM of Array Elements
public class Prac56 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //list.show();
        list.insert(5);
        list.insert(6);
        list.insert(8);
        list.insert(65);

        list.insertAtFront(15);
        //list.show();
        list.insertAfter(45,6);
        list.insertAfter(66, 15 );
        list.show();
        System.out.println("Size: "+list.size());
        list.insertBefore(10, 15);
        list.insertAt(89, 0);
        list.deleteAt(2);
        list.show();
        System.out.println("Size: "+list.size());
    }
}
class Node {

    int data;
    Node next;

}
class LinkedList {

    Node head;

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public void insertAtFront(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (head.next != null) {
            newNode.next = head;
            head = newNode;
        } else {
            head = newNode;
        }
    }

    void insertAfter(int data, int location) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node temp = head;

        while (temp.data != location) {

            temp = temp.next;
        }

        if (temp.data == location) {
            node.next=temp.next;
            temp.next=node;
        } else {
            System.out.println("Location not found");
        }
    }
    public void insertBefore(int data,int location) {
        Node node=new Node();
        node.data=data;
        node.next=null;
        Node temp1=head;
        if(head.data==location) {
            node.next=head;
            head=node;
        }else {


            while(temp1.next.data!=location) {
                temp1=temp1.next;
            }
            if(temp1.next.data==location) {
                node.next=temp1.next;
                temp1.next=node;
            }
            else {
                System.out.println("Location not found");
            }

        }

    }
    void insertAt(int data,int location) {

        if(location==0) {
            insertAtFront(data);
        }
        else {
            Node node = new Node();
            node.data=data;
            node.next=null;
            Node temp=head;
            for(int i=0;i<location-1;i++) {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
        }
    }

    public void deleteAt(int index) {
        if(index == 0) {
            head=head.next;
        }
        else {
            Node temp=head;
            for(int i=0;i<index-1;i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public void show() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LinkedList is empty");
        } else {

            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public int size() {

        int count = 1;
        Node temp = head;
        if (temp == null)
            return 0;
        else {
            while (temp.next != null) {
                count++;
                temp=temp.next;
            }
            return count;
        }

    }
}