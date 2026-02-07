package Array.TwoDemnArray;

public class both_row_colwise_reverse {
    static void main() {
        int[][] arr={   {10,23,25,65},
                        {18,52,54,69},
                        {78,85,41,12},
                        {15,89,64,73},
                        {54,62,10,23}   };

        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[arr.length-j-1][i]+" ");
            }
            System.out.println();
        }
    }
}
