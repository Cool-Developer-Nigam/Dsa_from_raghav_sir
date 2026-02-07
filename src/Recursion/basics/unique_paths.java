package Recursion.basics;

public class unique_paths {
    static void main() {

    }

//   unique path with more time complexity
    public int uniquePaths(int m,int n){
        if(m==1||n==1)return 1;
        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    }

//    another way solving the unique way like matrix in the input
//    we are given the grid order

//    let's solve like a 2d matrix like starting from 0th indices to
//    length-1 indices with helper function

public int unique_paths(int m, int n){
//        this will call the helper function and rest
//        of the things will be done in the helper
    return path(0,0,m-1,n-1);
}

    private int path(int s_row, int s_col, int e_row, int e_col) {

        if(s_row==e_row||s_col==e_col)return 1;
        if(s_row>e_row||s_col>e_col)return 0; //if goes out of bound
        int right=path(s_row+1,s_col,e_row,e_col); //counting the right parts
        int left=path(s_row,s_col+1,e_row,e_col); //counting the left parts

        return right+left; // it is the sum of right and left
    }

}
