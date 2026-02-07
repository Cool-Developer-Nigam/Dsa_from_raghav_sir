package Recursion.arrayProblems;

public class BinarySearch {
    static void main() {
        int[] arr={10,20,35,65,68,78};
        System.out.println(bsearch(arr,0,arr.length-1,65));
    }

    private static int bsearch(int[] arr, int s,int e, int tar) {
        if(s>e)return -1;
        int m=(s+e)/2;
        if(arr[m]==tar) return m;
        else if (arr[m]<tar) return  bsearch(arr,m+1,e,tar);
        else return bsearch(arr,s,m-1,tar);
    }
}
