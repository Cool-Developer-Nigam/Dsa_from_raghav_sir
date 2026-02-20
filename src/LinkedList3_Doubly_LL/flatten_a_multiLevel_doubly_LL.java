package LinkedList3_Doubly_LL;

public class flatten_a_multiLevel_doubly_LL {

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

    class Solution {
        public Node flatten(Node head) {
            if(head==null)return head;
            Node temp=head;
            while(temp!=null){
                if(temp.child==null)temp=temp.next;
                else{
                    Node child=flatten(temp.child);
                    temp.child=null;
                    Node b=temp.next;
                    temp.next=child;
                    child.prev=temp;
                    Node tail=child;
                    while(tail.next!=null){
                        tail=tail.next;
                    }
                    tail.next=b;
                    if(b!=null)b.prev=tail;
                    temp=b;
                }
            }
            return head;
        }
    }
}
