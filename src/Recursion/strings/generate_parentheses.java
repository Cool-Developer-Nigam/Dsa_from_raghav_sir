package Recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class generate_parentheses {
    static void main() {
        int n=2;
        List<String> ans=new ArrayList();
        helper("",n,0,0,ans);

    }

        public static void helper(String s,int n,int l,int r,List<String> ans){
            if(r==n){
                ans.add(s);
                return;
            }
            if(l<n)helper(s+"(",n,l+1,r,ans);
            if(r<l) helper(s+")",n,l,r+1,ans);
    }
}
