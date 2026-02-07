package Recursion.arrayProblems;

public class traversing_array {
    static void main() {
        int[] arr={10,20,35,65,98,78};

//        traverse(arr,0);
        reverse(arr,0);
    }
    static void traverse(int[] arr,int idx){
        if(idx==arr.length)return ;
        System.out.println(arr[idx]);
        traverse(arr,idx+1);
    }
    static void reverse(int[] arr,int idx){
        if(idx==arr.length)return ;
        reverse(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
