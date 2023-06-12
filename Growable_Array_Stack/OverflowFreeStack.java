public class OverflowFreeStack {

    //macro for MAX
    static int MAX = 2;
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

    private void emptyError() {
        System.err.println("Stack empty error occurs");
        System.exit(-1);
    }

    public Stack_Without_Lib() {   //default constructor for Stack object
        this(MAX);  //this line makes chain constructor to the next, with arguments
    }
    public Stack_Without_Lib(int n) {

        _s = new int[n];
        _top = -1;
        _size = n;
        initialize();

    }

    //push
    public void push(int item) {

        if(_top >= _size-1) {
            int newS[];
            newS = new int[2*_size];
            //copy previous data
            for(int i=0; i<_size; i++) {
                newS[i] = _s[i];
            }
            _s = newS;  //_s will show new reference to newS
            _size = 2*_size;  //_size will double
        }

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
