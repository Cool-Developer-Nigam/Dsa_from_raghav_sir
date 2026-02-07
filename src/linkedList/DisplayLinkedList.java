package linkedList;

public class DisplayLinkedList {
    static void display(Node head){
        Node temp=head;

        while(temp!=null){ //because last element is storing null in his next
            System.out.print(temp.val+" "); // then we will print the value
            temp=temp.next;// very very important because temp.next is the containg the reference of next element , so after printing one element we wre going to next element

        }

        //instead of using while loop we can use for loop

        System.out.println();
    }
    static void main() {
//        as we are in the same package linkedlist
//        we can directly use the class without any implementation


//        now we have created a linkedlist 10->20->30->40->50
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

//        to print the entire linkedlist we will create a function display
//        in which we will pass only the head element i.e. a

        display(a);



    }
}
