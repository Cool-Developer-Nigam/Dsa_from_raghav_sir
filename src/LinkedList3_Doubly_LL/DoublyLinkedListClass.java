package LinkedList3_Doubly_LL;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp=new ListNode(val);
        if(head==null)head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp=new ListNode(val);
        if(head==null)head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(size==0){ // or head==null;
            System.out.println("ll is empty");
            return;
        }
        if(size==1) {
            head = tail = null;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
    void deleteAtTail(){
        if(size==0){ // or head==null;
            System.out.println("ll is empty");
            return;
        };

        if(size==1) {
            head = tail = null;
            return;
        }
       tail=tail.prev;
       tail.next=null;
       size--;
    }
    void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void displayRev(){
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    void insert(int idx,int val){
        if(idx<0 || idx>=size){
            System.out.println("index out of bound");
            return;
        }
        if(idx==0) {
            insertAtHead(val);
            return;
        }
        if(idx==size-1) {
            insertAtTail(val);
            return;
        }

        ListNode temp=head;

//     here i am going to idx th node then doing you can do likely going to idx-1 th node and these kind of things
        for(int i=0;i<idx;i++)temp=temp.next;
        ListNode el=new ListNode(val);
        el.prev=temp.prev;
        temp.prev.next=el;
        el.next=temp;
        temp.prev=el;

    }
}
public class DoublyLinkedListClass {
    static void main() {

        DLL list=new DLL();
        list.insertAtHead(20);
        list.insertAtTail(30);
        list.insertAtHead(10);
        list.insertAtHead(40);
        list.insertAtTail(50);
        list.insertAtHead(60);
        list.insertAtHead(70);
        list.insertAtTail(80);
        list.insertAtHead(90);

//        list.display();
//        list.displayRev();

//        list.deleteAtHead();
//
//        list.display();
//        list.displayRev();
//
//        list.deleteAtTail();

        list.display();
//        list.displayRev();

        list.insert(3,56);
        list.display();
    }
}
