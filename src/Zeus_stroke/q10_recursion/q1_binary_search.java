package Zeus_stroke.q10_recursion;

//https://leetcode.com/problems/binary-search/

public class q1_binary_search {
    class Solution {
        public int search(int[] nums, int target) {
            return b_search(nums, target, 0, nums.length-1);
        }
        int b_search(int[] nums, int target, int s, int e){
            if(s>e)return -1;
            int m=s+(e-s)/2;
            if(nums[m]==target)return m;
            if(nums[m]<target)return b_search(nums,target,m+1,e);
            return b_search(nums,target,s,m-1);
        }
    }
}
