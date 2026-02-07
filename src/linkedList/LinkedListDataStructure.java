package linkedList;

class Linkedlist{ //it is user defined dta structure ,
    // the class Node that we have made was a user defined data type
    Node head;  //null
    Node tail;  //null


    int size; //to count the size of the linked list

    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null){
            //if the linkedlist is empty i.e. head=tail=null
            // ,then directly add temp to tail
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp; // now temp had become the last node ,
            // so the last node should be tail
        }

        size++; //after adding element size increases

    }

    void display(){
        if(head==null)return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null)head=tail=temp; //if the linked list is empty
        else{
            temp.next=head;
            head=temp;
        }

        size++;
        //size will increase
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        head.next=head;
        //directly move your head to next elemnet simple .
        // no need the change the reference of the previous node

        if(head==null)tail=null;//in case the Linked list has only one element now we have deleted
        // so head has become null that now we also need to move the tail to null also

        size--;
        //after deleting size will decrease
    }
}


// anywhere on the linked list package this file is accesible without any import

public class LinkedListDataStructure {

    static void main() {
    Linkedlist ll=new Linkedlist();
        ll.addAtTail(20);
        ll.addAtHead(35);
        ll.addAtTail(40);
        ll.addAtHead(55);

        ll.display();
    }
}
