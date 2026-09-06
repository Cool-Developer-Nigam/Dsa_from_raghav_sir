package Zeus_stroke.q9_dp;

public class q1_distict_subsequences {
//    brute force by normal recursion

//    class Solution {
//    public int numDistinct(String s, String t) {
//        return solve(s,t,0,0);
//    }
//    int solve(String s, String t, int i, int j){
//        if(j==t.length())return 1;
//        if(i==s.length())return 0;
//
//        if(s.charAt(i)==t.charAt(j))return solve(s,t,i+1,j+1)+solve(s,t,i+1,j);
//
//        return solve(s,t,i+1,j);
//    }
//}


//optimal solution by dp
class Solution {
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(n>m)return 0;

        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=m;i++){
            for(int j=n;j>=1;j--){
                if(s.charAt(i-1)==t.charAt(j-1))dp[j]=dp[j]+dp[j-1];
            }
        }

        return dp[n];
    }
}


}
