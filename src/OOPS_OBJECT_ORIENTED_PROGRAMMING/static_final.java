package OOPS_OBJECT_ORIENTED_PROGRAMMING;

class xyz{
    static String country;
    int run;
}
public class static_final {

    static void main() {

        xyz c1=new xyz();
//        c1.country="india";
        xyz c2=new xyz();
        c1.country="india";
        System.out.println(c2.country);
    }
}
