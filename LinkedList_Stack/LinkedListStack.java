public class LinkeListStack {
    //inner class - prevents creation an Object inside Main/Driver code
    static class StackItem {
        private int _value;
        private StackItem _next;

        StackItem(int v) {
            _value = v;
            _next = null;
        }
        public int getValue() {
            return _value;
        }
        public StackItem getNextItem() {
            return _next;
        }
        public void setNextItem(StackItem item) {
            _next = item;
        }
    }

    private StackItem _top;
    public void initialize() {
        _top = null;
    }
    public void emptyError() {
        System.err.println("Stack empty error occurs");
        System.exit(-1);
    }

    //Constructor for stack
    Stack_Without_Lib() {
        initialize();
    }
    //push
    public void push(int n) {
        if(_top == null) {  //if it is the first element
            _top = new StackItem(n);
        } else {
            StackItem item = new StackItem(n);
            item.setNextItem(_top);
            _top = item;
        }
    }

    //pop
    public int pop() {
        if(_top == null) emptyError();
        StackItem topItem = _top;
        _top = _top.getNextItem();
        return topItem.getValue();
    }

    //peek
    public int peek() {
        if(_top == null) emptyError();
        return (_top.getValue());
    }

    //clear
    public void clear() {
        initialize();
    }

    //isEmpty
    public boolean isEmpty() {
        if(_top == null) return true;
        return false;
    }
}
