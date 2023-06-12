public class Stack_Without_Lib {

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

    public Stack_Without_Lib() {   //default constructor for Stack object
        this(MAX);  //this line makes chain constructor to the next, with arguments
    }
    public Stack_Without_Lib(int n) {
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

    public boolean isEmpty() {
        if(_top == -1) return true;
        else return false;
    }

}
