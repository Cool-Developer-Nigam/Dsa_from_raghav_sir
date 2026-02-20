package LinkedList2.circular;


import linkedList.ListNode;

public class traversing_circular_LL {
    static void main() {

    }
    void printList(ListNode head) {
        // Your code here
        ListNode temp=head;
        while(temp.next!=head){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(temp.val);
    }
}
