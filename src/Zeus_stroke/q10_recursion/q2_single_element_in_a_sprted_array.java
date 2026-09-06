package Zeus_stroke.q10_recursion;

//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class q2_single_element_in_a_sprted_array {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            return bsrch(nums,0,nums.length-1);
        }
        int bsrch(int[] nums, int s, int e){
            if(s>=e)return nums[s];
            int m=(s+e)/2;
            if((m%2==0 &&(m+1<nums.length && nums[m]==nums[m+1])) || (m%2!=0 &&(m-1>=0 && nums[m]==nums[m-1])))return bsrch(nums,m+1,e);
            if((m%2!=0 &&(m+1<nums.length && nums[m]==nums[m+1])) || (m%2==0 &&(m-1>=0 && nums[m]==nums[m-1])))return bsrch(nums,s,m-1);
            return nums[m];

        }
    }
}
