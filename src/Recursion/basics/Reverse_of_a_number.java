package Recursion.basics;

public class Reverse_of_a_number {
    static void main() {
    int x=456123;
        System.out.println(rev(x));
    }

    private static int rev(int x) {
        if(x%10==x)return x;
        return x%10*Math.powExact(10,(int)Math.log10(x))+rev(x/10);
    }

    }
