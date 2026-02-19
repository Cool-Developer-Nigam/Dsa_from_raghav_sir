package LinkedList2.video_2;


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class odd_even_LL {
//    with index
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

//    without index
    public ListNode oddEvenList2(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode odd=new ListNode(-1);
        ListNode even=new ListNode(-1);
        ListNode temp=head;
        ListNode i=odd;
        ListNode j=even;
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
        i.next=even.next;
        return odd.next;
    }
}
