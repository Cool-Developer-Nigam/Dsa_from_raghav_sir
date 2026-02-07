package Recursion.arrayProblems;

public class LinearSearch {
    static void main() {
        int[] arr={10,20,35,65,98,78};
        System.out.println(lsearch(arr,65,0));
    }

    private static int lsearch(int[] arr, int target,int idx) {
        if(target==arr[idx])return idx;
        if(idx== arr.length)return -1;
        return lsearch(arr,target,idx+1);

    }
}
