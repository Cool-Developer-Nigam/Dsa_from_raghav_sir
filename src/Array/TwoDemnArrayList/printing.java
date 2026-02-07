package Array.TwoDemnArrayList;

import java.util.ArrayList;

public class printing {
    static void main() {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10); a.add(15); a.add(25);

        ArrayList<Integer> b=new ArrayList<>();
        b.add(18); b.add(12); b.add(27); b.add(9);

        ArrayList<Integer> c=new ArrayList<>();
        c.add(12); c.add(8); c.add(16);

        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

//        System.out.println(arr); // we can directly print the arraylist like this

//        for mannual printing of arrayList

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }
}
