package LinkedList2;

public class Max_twin_Sum_LinkedList {
    class Solution {
        public int pairSum(ListNode head) {
            if(head==null || head.next==null)return head.val;
            if(head.next.next==null)return head.val+head.next.val;
            ListNode slow=head;
            ListNode fast=head.next.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;

            }
            ListNode head2=slow.next;
            slow.next=null;

            head2=reverse(head2);
            int max=head.val+head2.val;

            ListNode t=head;
            ListNode t2=head2;

            while(t!=null || t2!=null){
                if((t.val+t2.val)>max)max=t.val+t2.val;
                t=t.next;
                t2=t2.next;
            }
            return max;

        }

        ListNode reverse(ListNode h){
            ListNode c=h;
            ListNode f=h;
            ListNode p=null;
            while(c!=null){
                f=c.next;
                c.next=p;
                p=c;
                c=f;
            }
            return p;
        }
    }
}
