package merge_sort;

import java.sql.SQLOutput;
import java.util.Arrays;

public class merge_sort_coding {
    static void main() {
    int[] arr={1,50,6502,8,23,97,5,-4,526};
    mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int n=arr.length;

//        step 4:base case of the recursive call
        if(n==1)return ;
        //because if n==1 i.e. array length is 1
        // i.e. only a single element is present that means that is sorted.

//        step 1:split the array into 2 subarrays (one of n/2 size and another of n-n/2 size )
//        actually we can not split the original array we will create 2 new arrays and will add elements of the main array to them

        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        int idx=0;
        for(int i=0;i<a.length;i++)a[i]=arr[idx++];
        for(int i=0;i<b.length;i++)b[i]=arr[idx++];

//        now send them for the merge_sort
        mergeSort(a);
        mergeSort(b);

        merge(a,b,arr);
    }
    static void merge(int[] a,int[] b,int[] arr){
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j])arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }

        while(i< a.length)arr[k++]=a[i++];
        while(j<b.length)arr[k++]=b[j++];
    }

}
