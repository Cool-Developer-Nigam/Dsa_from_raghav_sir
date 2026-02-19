package LinkedList2.video_1;

public class reorder_list {
    class Solution {
        public void reorderList(ListNode head) {
            if(head==null || head.next==null)return;
            ListNode slow=head;
            ListNode fast=head.next.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode head2=slow.next;
            slow.next=null;

            head2=reverse(head2);
            head=merge(head,head2);
            return;
        }
        ListNode merge(ListNode head,ListNode head2){
            ListNode i=head;
            ListNode j=head2;
            ListNode d=new ListNode(-1);
            ListNode k=d;
            while(i!=null && j!=null){
                k.next=i;
                k=k.next;
                i=i.next;
                k.next=j;
                k=k.next;
                j=j.next;
            }
            if(j!=null){
                k.next=j;
                k=k.next;
            }
            k.next=null;
            return d.next;
        }

        ListNode reverse(ListNode h){
            ListNode c=h;
            ListNode p=null;
            ListNode f=h;
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
