package Zeus_stroke.q10_recursion;

import java.util.ArrayList;
import java.util.List;

public class q3_generate_parentheses {
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> ans=new ArrayList<>();
            helper("",ans,0,0,n);
            return ans;
        }
        void helper(String s, List<String> ans, int l, int r, int n){
            if(r==n){
                ans.add(s);
                return;
            }
            if(l<n)helper(s+'(',ans,l+1,r,n);
            if(r<l)helper(s+')',ans,l,r+1,n);

        }
    }
}
