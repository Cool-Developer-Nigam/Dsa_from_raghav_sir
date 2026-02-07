package cyclic_sort;


public class first_missing_positive {
    static void main() {
        int[] arr={0,1,8,6,5,3,2,4,7};
        System.out.println(first_pos(arr));
    }

    private static int first_pos(int[] arr) {
        int n=arr.length;
        int i=0;

        while(i<n){
            if(arr[i]==i+1
                    ||arr[i]==arr[arr[i]-1]  //here correct index will be arr[i]-1 because duplicate may be present and if we swap then infinite swapping will occur

                    ||arr[i]<=0  // because we have to find the +ve number
                    ||arr[i]>n // we have to find the 1st or smallest +ve number
            )
                i++;
            else swap(arr,i,arr[i]-1);
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        // If all positions are correct
        return n + 1;
    }


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
