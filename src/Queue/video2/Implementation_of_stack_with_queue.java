package Queue.video2;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation_of_stack_with_queue {


//    it is Add efficient approach

//    class MyStack {
//        Queue<Integer> q=new LinkedList<>();
//        public MyStack() {
//
//        }
//
//        public void push(int x) { //O(1)
//            q.add(x);
//        }
//
//        public int pop() { //O(n)
//            int n=q.size();
//            for(int i=1;i<=n-1;i++){
//                q.add(q.remove());
//            }
//            return q.remove();
//        }
//
//        public int top() { //O(n)
//            int n=q.size();
//            for(int i=1;i<=n-1;i++){
//                q.add(q.remove());
//            }
//            int peek= q.peek();
//            q.add(q.remove());   //important
//            return peek;
//        }
//
//        public boolean empty() {
//            return q.size()==0;
//
//        }
//    }




//    POP efficient implementation of Stack by queue

    class MyStack {
        Queue<Integer> q=new LinkedList<>();
        public MyStack() {

        }

        public void push(int x) { //O(n)
            q.add(x);
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }

        }

        public int pop() {
            return q.remove();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.size()==0;

        }
    }

}
