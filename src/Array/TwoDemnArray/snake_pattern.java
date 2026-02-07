package Array.TwoDemnArray;

public class snake_pattern {
    static void main() {
        int[][] arr={{10,23,25,65},{18,52,54,69},{78,85,41,12},{15,89,64,73},{54,62,10,23}};

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int k=arr[i].length-1;k>=0;k--){
                    System.out.print(arr[i][k]+" ");
                }
            }
            System.out.println();
        }
    }
}
