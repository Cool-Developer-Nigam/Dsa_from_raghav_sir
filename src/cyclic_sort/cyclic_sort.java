package cyclic_sort;

import java.util.Arrays;

public class cyclic_sort {
    static void main() {
        int[] arr={0,1,8,6,5,3,2,4,7};
        Csort(arr);
        System.out.println(Arrays.toString(arr));
    }
// cyclic sort for array containing 0 to n elements
    private static void Csort(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==i)i++;
            else{
                int idx=nums[i];
               int temp=nums[idx];
               nums[idx]=nums[i];
               nums[i]=temp;
            }
        }
    }
}
