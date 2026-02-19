package LinkedList2.video_2;

public class reverse_linkedList_2 {
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if (head.next == null) return head;

            // Dummy node handles the left == 1 edge case cleanly
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode temp = dummy;

            // Step 1: Walk to the node just BEFORE 'left'
            for (int i = 1; i < left; i++) {
                temp = temp.next;
            }

            ListNode tail1 = temp;          // node just before the segment
            ListNode head2 = temp.next;     // ✅ save head of segment BEFORE cutting

            // Step 2: Walk to the node at 'right'
            for (int i = left; i <= right; i++) {
                temp = temp.next;
            }

            ListNode tail2 = temp;          // last node of segment (at index 'right')
            ListNode head3 = temp.next;     // node just after the segment

            // Step 3: Detach the segment
            tail1.next = null;
            tail2.next = null;

            // Step 4: Reverse the segment
            head2 = reverse(head2);

            // Step 5: Reconnect
            tail1.next = head2;             // prev → new head of reversed segment
            // after reverse, head2's original node is now the tail
            // we need to find the tail to attach head3
            ListNode newTail = tail1.next;
            while (newTail.next != null) {
                newTail = newTail.next;
            }
            newTail.next = head3;

            return dummy.next;
        }

        ListNode reverse(ListNode head) {
            ListNode prev = null, curr = head;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }
}
