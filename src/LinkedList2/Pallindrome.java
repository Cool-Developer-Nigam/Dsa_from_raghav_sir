package LinkedList2;

import java.util.ArrayList;

public class Pallindrome {

        public boolean isPalindrome(ListNode head) {
            ListNode t=head;
            ArrayList<Integer> arr=new ArrayList();
            while(t!=null){
                arr.add(t.val);
                t=t.next;
            }
            for(int i=0,j=arr.size()-1;i<j;i++,j--){
                if(arr.get(i)!=arr.get(j))return false;
            }
            return true;
        }

}
