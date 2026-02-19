package LinkedList2.video_2;

public class Swap_nodes_in_pairs {

//    by breaking the array 1st then joining again

        public ListNode swapPairs(ListNode head) {
            if(head==null || head.next==null)return head;
            ListNode d=new ListNode(-1);
            ListNode d2=new ListNode(-1);
            ListNode temp=head;
            ListNode i=d;
            ListNode j=d2;
            while(temp!=null && temp.next!=null){
                i.next=temp;
                i=i.next;
                temp=temp.next;
                j.next=temp;
                j=j.next;
                temp=temp.next;
            }
            if(temp != null){
                i.next = temp;
                i = i.next;
            }
            j.next=null;
            i.next=null;
            return merge(d.next,d2.next);
        }
        public ListNode merge(ListNode list1, ListNode list2) {
            ListNode i = list1;
            ListNode j = list2;
            ListNode d = new ListNode(-1);
            ListNode k = d;
            while (i != null && j != null){
                k.next = j;
                j = j.next;
                k = k.next;
                k.next = i;
                i = i.next;
                k = k.next;

            }
            if (i == null) {
                k.next = j;
            }
            if (j == null) {
                k.next = i;
            }
            return d.next;
        }

//        by 3 variables method without extra other methods
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode d=new ListNode(-1);

        ListNode a=head;
        ListNode b=head.next;
        ListNode c=d;
        while(a!=null && b!=null){
            c.next=b;
            a.next=b.next;
            b.next=a;
            c=a;
            a=a.next;
            if(a!=null)b=a.next;
        }
        return d.next;
    }

}
}
