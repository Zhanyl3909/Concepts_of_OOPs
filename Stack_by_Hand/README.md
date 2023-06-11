# Stack 
LIFO (last in first out) 방식으로 운영되는 collection 객체 

![App Screenshot](/Stack_by_Hand/stack.png)

```java
public class Main {

    public static void main(String[] args) {

        MyStack a = new MyStack();
        MyStack b = new MyStack();

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
```

```java
public class MyStack {

    //macro for MAX
    static int MAX = 100;
    private int _s[];
    private int _top;
    private int _size;

    //initialize
    private void initialize() {
        for(int i=0; i<_size; i++) {
            _s[i] = 0;
        }
    }

    //Errors
    private void overFlowError() {
        System.err.println("Stack overflow error occurs");
        System.exit(-1);
    }
    private void emptyError() {
        System.err.println("Stack empty error occurs");
        System.exit(-1);
    }

    public MyStack() {   //default constructor for Stack object
        this(MAX);  //this line makes chain constructor to the next, with arguments
    }
    public MyStack(int n) {
        if(n > MAX) {
            System.err.println("Stack size must be less than " + MAX + "!");
            System.exit(-1);
        }
        _s = new int[MAX];
        _top = -1;
        _size = n;
        initialize();

    }

    //push
    public void push(int item) {
        if(_top >= _size-1) overFlowError();
        _top++;
        _s[_top] = item;
    }

    //pop
    public int pop() {
        if(_top == -1) emptyError();
        int poped = _s[_top];
        _top--;
        return poped;
    }

    //reset
    public void clear() {
        _top = -1;
        initialize();
    }

    //size
    public int size() {
        return _top+1;
    }

    //peek
    public int peek() {
        if(_top == -1) emptyError();
        return _s[_top];
    }

}
```
