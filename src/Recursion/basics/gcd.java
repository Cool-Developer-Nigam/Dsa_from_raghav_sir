package Recursion.basics;

public class gcd {
    static void main(){
        System.out.println(gcd(300,375));
    }
    static int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
}
