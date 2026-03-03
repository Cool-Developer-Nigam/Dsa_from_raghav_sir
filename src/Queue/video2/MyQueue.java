package Queue.video2;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class MyQueue {
    Node head;
    Node tail;
    int size;

//    to implement queue by linkedList , the addition will be at tail and the deletion will be at head ,queue is FIFO(first in first out) . so the deletion will be at head.

    void add(int val){
        Node temp=new Node(val);
         if(size==0)head=tail=temp;
         else{
             tail.next=temp;
             tail=temp;
         }
         size++;
    }

    int remove(){
        if(size==0){
            System.out.println("error");
            return -1;
        }
        int front= head.val;
        head=head.next;
        size--;
        return front;
    }

    int peek(){
        if(size==0){
            System.out.println("error");
            return -1;
        }

        return head.val;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}


