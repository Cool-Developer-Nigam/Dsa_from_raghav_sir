package LinkedList2.video_1;

import java.util.ArrayList;

public class Reverse_LL {
//  with extra arrayList
        public ListNode reverseList_With_Arraylist(ListNode head) {
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

//        without extra space

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


//    with recursive approach
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode a=head.next;
        head.next=null;
        ListNode b=reverseList(a);
        a.next=head;
        return b;
    }

    }

