package LinkedList2;

public class odd_even_LL {
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            ListNode odd=new ListNode(-1);
            ListNode even=new ListNode(-1);
            ListNode i=odd;
            ListNode j=even;

            ListNode temp=head;
            int idx=1;

            while(temp!=null){
                if(idx%2!=0){
                    i.next=temp;
                    i=i.next;
                }
                else{
                    j.next=temp;
                    j=j.next;
                }

                temp=temp.next;
                idx++;
            }
            j.next=null;
            i.next=even.next;
            return odd.next;
        }
    }
}
