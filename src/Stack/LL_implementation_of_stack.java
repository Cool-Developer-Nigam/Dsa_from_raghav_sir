package Stack;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

class MyStack{
    Node head;
    int len;
    int peek(){
        if(len==0) {
            System.out.println("stack is empty");
            return -1;
        }
        return head.val;
    }
    int pop(){  // throws Exception{
        if(len==0) {
            System.out.println("stack is empty");
            return -1;
        }
        int res=head.val;
        head=head.next;
        len--;
        return res;
    }
    void push(int val){
        Node temp=new Node(val);
        if(len==0)head=temp;
        else{
            temp.next=head;
            head=temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class LL_implementation_of_stack {
    static void main() {

        MyStack st=new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();
        st.peek();
        st.display();
        st.pop();
        st.display();

        System.out.println(st.size());
    }
}
