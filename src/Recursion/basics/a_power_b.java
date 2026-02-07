package Recursion.basics;

import java.util.Scanner;

public class a_power_b {
    static void main() {
        int a=new Scanner(System.in).nextInt();
        int b=new Scanner(System.in).nextInt();
        System.out.println(pow(a,b));
        System.out.println(pow_less_time(a,b));
    }
    static int pow(int a,int b){
        if(b==0)return 1;
        return a*pow(a,b-1);
    }

    static int pow_less_time(int a,int b){
        if(b==0)return 1;
        int call=pow_less_time(a,b/2);
        if(b%2==0)return call*call;
         return  a*call*call;
    }
}
