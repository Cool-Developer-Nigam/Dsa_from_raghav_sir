package Recursion.basics;

public class fibonacci_series {
    static void main() {
        int n=10;
        System.out.println(fibbo((char)n));
    }

    private static int fibbo(int a) {
        if(a<=1)return a;
        return fibbo(a-1)+fibbo(a-2);
    }
}
