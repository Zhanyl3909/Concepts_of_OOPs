public class LineBuffer {

    //macro implementation
    static int ID_QUIT = 1;
    static int ID_PLUS = 2;
    static int ID_MINUS = 3;
    static int ID_MULTIPLY = 4;
    static int ID_DIVIDE = 5;
    static int ID_EOD = 6;
    static int ID_OPERAND = 7;


    

    private String[] _tokens;
    private int _index;
    private int _tokenValue;
    LineBuffer(String text) {
        _tokens = text.split(" ");
        _index = -1;
        _tokenValue = 0;

    }

    public int getTokenValue() {
        return _tokenValue;
    }

    public int getNextToken() {
        _index++;

        if(_index == _tokens.length) return ID_EOD;

        if(_tokens[_index].equals("+")) return ID_PLUS;
        if(_tokens[_index].equals("-")) return ID_MINUS;
        if(_tokens[_index].equals("*")) return ID_MULTIPLY;
        if(_tokens[_index].equals("/")) return ID_DIVIDE;

        _tokenValue = Integer.parseInt(_tokens[_index]);
        return ID_OPERAND;
    }

}











    /*
    # 1 - WITHOUT ANY LIBRARY
    public int getNextToken() {

        //skip blanks
        while(_text[_position] == ' ') _position++;

        if(_text[_position] == '\0') return ID_EOD;
        if(_text[_position] == '+') {
            _position++;
            return ID_PLUS;
        }
        if (_text[_position] == '*') {
            _position++;
            return ID_MULTIPLY;
        }
        if(_text[_position] == '/') {
            _position++;
            return ID_DIVIDE;
        }
        if((_text[_position] == '-' && _text[_position + 1] == ' ') || (_text[_position] == '-' && _text[_position + 1] == '\0'))
        {
            _position++;
            return ID_MINUS;
        }
        String buffer = "";
        int i = 0;

        if(_text[_position] == '-') {
            buffer = buffer + "-";
            i++;
            _position++;
        }
        while (_text[_position] >= '0' && _text[_position] <= '9') {
            buffer = buffer + _text[_position];
            i++;
            _position++;
        }
        _tokenValue = Integer.parseInt(buffer);
        if(_text[_position] != ' ' && _text[_position] != '\0')
            return ID_QUIT;
        return ID_OPERAND;
    }
}

     */




/*
Deligate with
1) String Split method;
2) StringTokenizer;
 */
