package cyclic_sort;

public class missing_element {
    static void main() {
        int[] arr={0,1,8,6,5,3,2,4,7};
        find_missing(arr);
        System.out.println(arr);
    }
    static int find_missing(int[] nums){
        int i=0;
        while(i< nums.length){
            if(nums[i]==i || nums[i]==nums.length)i++;
            //nums[i]==nums.length is written
                // so that we can overcome the problem of array out of bound

            else{
                int idx=nums[i];
                int temp=nums[idx];
                nums[idx]=nums[i];
                nums[i]=temp;
            }

        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j)return j;
        }
        return nums.length+1;
    }
}
