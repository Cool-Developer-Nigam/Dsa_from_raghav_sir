package merge_sort;

public class merge_two_sorted_array {
    static void main() {

    }

    static void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j])c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i< a.length)c[k++]=a[i++];
        while(j<a.length)c[k++]=b[j++];
    }
}
