package Stack;

import java.util.Stack;

public class push_element_Bottom {
    static void main() {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);

       push_ele(st,99);
        System.out.println(st);
       reverse_recur(st);
        System.out.println(st);
    }

    //    to push an element to the bottom of the stack with recursion
    static void push_ele(Stack<Integer> st,int ele){
        if(st.size()==0) {
            st.push(ele);
            return;
        }
        int top=st.pop();
       push_ele(st,ele);
        st.push(top);

    }

    static void reverse_recur(Stack<Integer> st){
        if(st.isEmpty())return;
        int top=st.pop();
        reverse_recur(st);
        push_ele(st,top);

    }
}
