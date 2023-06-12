import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {

        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();

        a.push(10);
        a.push(20);
        int x = a.pop();
        a.push(30);
        a.push(40);

        b.push(100);
        b.push(200);
        b.push(300);
        b.push(400);
        int y = b.pop();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("top of a stack a = " + a.peek());
        System.out.println("top of a stack b = " + b.peek());

        System.out.println("Size of Stack a before reset = " + a.size());
        a.clear();
        System.out.println("Size of Stack a after reset = " + a.size());

    }
}
