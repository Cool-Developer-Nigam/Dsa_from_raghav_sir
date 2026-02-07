package Array.TwoDemnArray;

public class array_2D_row_with_max_sum {
    static void main() {
        int[][] arr={{10,23,2525,65},{18,502,54,69},{78,85,41,12}};
        int max_sum=arr[0][0];
        int row=0;
        for(int i=0;i<arr.length;i++){
            int sum_row=0;
            for(int j=0;j<arr[i].length;j++){
                sum_row+=arr[i][j];
            }
            if(max_sum<sum_row) {
                max_sum = sum_row;
                row=i;
            }
        }
        System.out.println(max_sum);
        System.out.println(row);
    }
}
