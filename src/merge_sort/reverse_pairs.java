package merge_sort;

public class reverse_pairs {
        static int count = 0;

        static void main() {
            int[] arr={1,50,6502,8,23,97,5,-4,526};
            count = 0;  // Reset count for each call
            mergeSort(arr);
            System.out.println(count);
        }

        private static void mergeSort(int[] arr) {
            int n = arr.length;
            if(n == 1) return;

            int[] a = new int[n/2];
            int[] b = new int[n - n/2];

            for(int i = 0; i < n/2; i++) {
                a[i] = arr[i];
            }
            for(int i = n/2; i < n; i++) {
                b[i - n/2] = arr[i];
            }

            mergeSort(a);
            mergeSort(b);

            merge(a, b, arr);
        }

        private static void merge(int[] a, int[] b, int[] arr) {
            int i = 0, j = 0, k = 0;

            while(i < a.length && j < b.length) {

                if(a[i] <= b[j]) {
                    arr[k++] = a[i++];
                }
                else{
                    if(a[i]>2*b[j]){
                        count+=arr.length-i;
                    }
                    arr[k++] = b[j++];
                }
            }

            while(i < a.length) {
                arr[k++] = a[i++];
            }

            while(j < b.length) {
                arr[k++] = b[j++];
            }
        }
    }

