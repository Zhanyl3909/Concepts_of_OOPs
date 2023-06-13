public class Stack <Type>{
    static int MAX = 100;
    protected Type _s[];
    protected int _size;
    protected int _top;

    //initialize
    private void initialize() {  //private because of user not get access for this method (only inside Stack class) 
        for(int i=0; i<_size; i++) _s[i] = null;
    }


    //error
    private void overFlowError() {
        System.err.println("Stack Overflow Error");
        System.exit(-1);
    }

    private void emptyError() {
        System.err.println("Stack Empty Error");
        System.exit(-1);
    }

    //default constructor for Stack 
    Stack() {
        this(MAX);  //chain constructor 
    }
    Stack(int n) {  //this(MAX) - this line of code brings here
        _s = (Type[]) new Object[n];
        _size = n;
        _top = -1;
        initialize();
    }

    //push
    public void push(Type item) {
        if(_top >= _size-1) overFlowError();
        _top++;
        _s[_top] = item;
    }

    public Type pop() {
        if(_top == -1) emptyError();
        Type value = _s[_top];
        _top--;
        return value;
    }

    //peek
    public Type peek() {
        if(_top == -1) emptyError();
        return _s[_top];
    }

    //reset
    public void reset() {
        _top = -1;
        initialize();
    }

    //isEmpty
    public boolean isEmpty() {
        if(_top == -1) return true;
        else return false;
    }

}
