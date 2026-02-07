package Recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class powerSet {
    static void main() {
        String str="abc";

        List<String> list=new ArrayList<>();

//you can pass this list as an argument  and using that list you can
//add the subsets in that list then you can return that or simply after storing leave that
//        the main list in the main function will automatically have the subsets
//        because in java arrays and lists are like pass by reference

        subsets("",str,0);

    }


    private static void subsets(String ans, String str, int idx) {
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        subsets(ans+str.charAt(idx),str,idx+1); //picking
        subsets(ans,str,idx+1);     //skiping

    }
}
