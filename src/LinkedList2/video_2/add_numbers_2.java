package LinkedList2.video_2;

public class add_numbers_2 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            l1=reverse(l1);
            l2=reverse(l2);
            ListNode res=addTwo(l1,l2);
            return reverse(res);

        }
        ListNode reverse(ListNode head){
            ListNode c=head;
            ListNode p=null;
            ListNode f=head;
            while(c!=null){
                f=c.next;
                c.next=p;
                p=c;
                c=f;
            }
            return p;
        }
        ListNode addTwo(ListNode l1, ListNode l2) {
            ListNode dummy=new ListNode(-1);
            ListNode t=dummy;
            int carry=0;
            ListNode i=l1;
            ListNode j=l2;
            int sum=0;

            while(i!=null && j!=null){
                sum=i.val+j.val+carry;
                t.next=new ListNode(sum%10);
                t=t.next;
                carry=sum/10;
                i=i.next;
                j=j.next;
            }

            while(i!=null){
                sum=i.val+carry;
                t.next=new ListNode(sum%10);
                t=t.next;
                carry=sum/10;
                i=i.next;
            }

            while(j!=null){
                sum=j.val+carry;
                t.next=new ListNode(sum%10);
                t=t.next;
                carry=sum/10;
                j=j.next;
            }
            if(carry!=0){
                t.next=new ListNode(carry);
                t=t.next;
            }
            t.next=null;
            return dummy.next;

        }

    }
}
