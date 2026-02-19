package LinkedList2.video_1;

public class Pallindrome {

//    with arrayList

//        public boolean isPalindrome(ListListNode head) {
//            ListListNode t=head;
//            ArrayList<Integer> arr=new ArrayList();
//            while(t!=null){
//                arr.add(t.val);
//                t=t.next;
//            }
//            for(int i=0,j=arr.size()-1;i<j;i++,j--){
//                if(arr.get(i)!=arr.get(j))return false;
//            }
//            return true;
//        }

//    without extra space

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

    boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);

        ListNode i = head;
        ListNode j = head2;

        while(j != null) {
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }

        return true;
    }
}
