package Array.TwoDemnArray;


public class transpose_matrix {
    static void main() {
        int[][] arr={
                        {10,23,25,65},
                        {18,52,54,69},
                        {78,85,41,12},
                        {15,89,64,73},
                                          };


        for(int i=0;i< arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int[] ele:arr){
            for(int el:ele){
                System.out.print(el+" ");
            }
            System.out.println();
        }


//        System.out.println(Arrays.deepToString(arr));
    }
}
