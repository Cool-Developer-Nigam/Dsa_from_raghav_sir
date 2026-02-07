package OOPS_OBJECT_ORIENTED_PROGRAMMING;

 class student{
     String name;
     int roll_no;
     double cgpa;

    public static class tea{
         int count;
     }
 }
public class userDefinedClass {
    static void main() {

        student s1=new student();
        s1.name="Nigam Prasad Sahoo";
        s1.roll_no=34;
        s1.cgpa=9.95;


        System.out.println(s1); // will print OOPS_OBJECT_ORIENTED_PROGRAMMING.student@8efb846


//        for user readable
        System.out.println(s1.name);

        student.tea te=new student.tea();

    }
}
