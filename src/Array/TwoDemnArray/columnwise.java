package Array.TwoDemnArray;

public class columnwise {
    static void main() {
        int[][] arr={{10,23,25,65},{18,52,54,69},{78,85,41,12}};

// printing the matrix

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

// column inverse of the matrix printing

        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

//to print using one for each loop

        for(int i=0;i<arr.length;i++){
            for(int element:arr[i]){
                System.out.print(element+" ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();


//to print using two for each loop

        for(int[] element:arr){
            for(int ele:element){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
