package Array.TwoDemnArray;

public class spirally_traversing_array {
    static void main() {
            int[][] arr={   {10,23,25,65},
                            {18,52,54,69},
                            {78,85,41,12},
                            {15,89,64,73},
                            {54,62,10,23}   };
        int s_row=0;
        int e_row=arr.length-1;
        int s_col=0;
        int e_col=arr[0].length-1;
        int count=0;
        int total=arr.length*arr[0].length;


        while(count<total){
            for(int i=s_col;i<=e_col;i++){
                System.out.println(arr[s_row][i]);
                count++;
            }
            s_row++;
            for(int i=s_row;i<=e_row;i++){
                System.out.println(arr[i][e_col]);
                count++;
            }
            e_col--;
            for(int i=e_col;i>=s_col;i--){
                System.out.println(arr[e_row][i]);
                count++;
            }
            e_row--;
            for(int i=e_row;i>=s_row;i--){
                System.out.println(arr[i][s_col]);
                count++;
            }
            s_col++;

        }
    }
}
