package LinkedList3_Doubly_LL;

public class min_max_distance_critical_nodes {
    class Solution {
        public int[] nodesBetweenCriticalPoints(ListNode head) {
            int[] ans={-1,-1};
            ListNode a=head;
            ListNode b=head.next;
            ListNode c=head.next.next;

            int idx=1,fIdx=-1,lIdx=-1,minDist=Integer.MAX_VALUE;

            if(c==null)return ans;

            while(c!=null){
                if((b.val<a.val && b.val<c.val)||(b.val>a.val && b.val>c.val)){
                    if(fIdx==-1)fIdx=idx;
                    if(lIdx!=-1)minDist=Math.min(idx-lIdx,minDist);
                    lIdx=idx;
                }
                a=b;
                b=c;
                c=c.next;
                idx++;
            }
            int maxDist=lIdx-fIdx;

            if(maxDist==0)maxDist=-1;
            if(minDist==Integer.MAX_VALUE)minDist=-1;
            ans[0]=minDist;
            ans[1]=maxDist;

            return ans;
        }
    }
}
