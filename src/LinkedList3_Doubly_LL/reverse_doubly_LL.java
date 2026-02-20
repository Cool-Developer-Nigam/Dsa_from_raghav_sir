package LinkedList3_Doubly_LL;

public class reverse_doubly_LL {
    static void main() {

    }
//    with 3 pointers like in Linked List
    ListNode reverse(ListNode head){
        ListNode f=null;
        ListNode c=head;
        ListNode p=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            c.prev=f;
            p=c;
            c=f;
        }
        return p;
    }

//    with 2 pointers
    ListNode reverse_with_2_pointers(ListNode head){
        ListNode c=head;
        ListNode t=null;
        while(c!=null){
            t=c.prev;
            c.prev=c.next;
            c.next=t;
            c=c.prev;
        }
        return t.prev;
    }
}
