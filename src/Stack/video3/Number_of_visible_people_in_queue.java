package Stack.video3;

import java.util.Stack;

public class Number_of_visible_people_in_queue {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<Integer>();
        st.push(heights[n-1]);

        for(int i=n-2;i>=0;i--){
            int count=0;
            while(st.size()!=0 && st.peek()<=heights[i]){
                count++;
                st.pop();
            }
            if(st.size()>0)count++;
            ans[i]=count;
            st.push(heights[i]);
        }
        return ans;
    }
}
