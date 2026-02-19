package LinkedList2.video_2;


import java.util.ArrayList;

public class merge_k_sorted_LL {
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            ArrayList<ListNode> arr=new ArrayList();
            for(ListNode el:lists){
                arr.add(el);
            }
            while(arr.size()>1){
                ArrayList<ListNode> brr=new ArrayList();
                for(int i=0;i<arr.size();i+=2){
                    if(i+1<arr.size())brr.add(merge(arr.get(i),arr.get(i+1)));
                    else brr.add(arr.get(i));
                }
                arr=brr;
            }
            return (arr.size()==0)?null:arr.get(0);

        }
        public ListNode merge(ListNode list1, ListNode list2) {
            ListNode i=list1;
            ListNode j=list2;
            ListNode d=new ListNode(-1);
            ListNode k=d;
            while(i!=null && j!=null){
                if(i.val<=j.val){
                    k.next=i;
                    i=i.next;
                }
                else {
                    k.next=j;
                    j=j.next;
                }
                k=k.next;
            }
            if(i==null){
                k.next=j;
            }
            if(j==null){
                k.next=i;
            }
            return d.next;
        }
    }
}
