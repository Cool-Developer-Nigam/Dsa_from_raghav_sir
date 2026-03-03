package Queue.video2;

public class LLimplementationOfQueue {
    static void main() {
        MyQueue q=new MyQueue();
        q.add(20);
        q.add(30);
        q.add(85);
        q.add(56);
        q.add(45);
        q.add(32);

        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
    }
}
