package LinkedList2;

import java.util.ArrayList;

public class Reverse_LL {
    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head==null || head.next==null)return head;
            ArrayList<ListNode> arr=new ArrayList();

            ListNode temp=head;
            while(temp!=null){
                arr.add(temp);
                temp=temp.next;
            }

            int size=arr.size();

            for(int i=size-1;i>0;i--){
                arr.get(i).next=arr.get(i-1);
            }
            arr.get(0).next=null;
            return arr.get(size-1);
        }
    }
}
