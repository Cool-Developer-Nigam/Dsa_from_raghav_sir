package LinkedList2.video_1;

public class Sort_LL {

        public ListNode sortList(ListNode head) {
            if(head==null || head.next == null) return head;
            ListNode slow=head;
            ListNode fast=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode head2=slow.next;
            slow.next=null;
            head=sortList(head);
            head2=sortList(head2);
            return mergeTwoLists(head,head2);
        }
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode i = list1;
            ListNode j = list2;
            ListNode d = new ListNode(-1);
            ListNode k = d;
            while (i != null && j != null) {
                if (i.val <= j.val) {
                    k.next = i;
                    i = i.next;
                } else {
                    k.next = j;
                    j = j.next;
                }
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
    }

