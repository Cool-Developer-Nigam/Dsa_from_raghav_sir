package Array.TwoDemnArray;

public class matrix_multiplication {
    static void main() {
        int[][] arr={   {10,23,25,65},
                        {18,52,54,69},
                        {78,85,41,12},
                        {15,89,64,73},
                        {54,62,10,23}   };

        int [][] brr={
                {25,65,8,94,94},
                {78,85,41,12,54},
                {15,89,64,73,49},
                {54,62,10,23,42}
        };

        int [][] res=new int[arr.length][brr[0].length];

        for(int i=0;i< res.length;i++){
            for(int j=0;j<res[0].length;j++){
                for(int k=0;k<brr.length;k++){
                    res[i][j]+=arr[i][k]*brr[k][j];
                }
            }
        }

        for(int[] a:res){
            for(int el:a){
                System.out.print(el+" ");
            }
            System.out.println();
        }

        for(int i=0;i< res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
