import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.Exception;

public class Main {


    static String getLine()
    {
        String str = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            str = br.readLine();
        } catch (IOException ex) {
            //error handler
        }
        return str;
    }
    public static void main(String[] args)  {
        System.out.println("Type postfix expression : (ex) 1 2 3 + +");
        Stack_Without_Lib operands = new Stack_Without_Lib();

        while (true) {
            String aline;
            aline = getLine();  //static method, which helps to store user String
            LineBuffer buffer = new LineBuffer(aline);

            while (true) {
                int value = 0;
                int tokenID = buffer.getNextToken();
                value = buffer.getTokenValue();

                if (tokenID == LineBuffer.ID_QUIT) {
                    System.exit(0);
                } else if (tokenID == LineBuffer.ID_PLUS) {
                    int a = operands.pop();
                    int b = operands.pop();
                    operands.push(a + b);
                } else if (tokenID == LineBuffer.ID_MINUS) {
                    int a = operands.pop();
                    int b = operands.pop();
                    operands.push(b - a);
                } else if (tokenID == LineBuffer.ID_MULTIPLY) {
                    int a = operands.pop();
                    int b = operands.pop();
                    operands.push(a * b);
                } else if (tokenID == LineBuffer.ID_DIVIDE) {
                    int a = operands.pop();
                    int b = operands.pop();
                    operands.push(b / a);
                } else if (tokenID == LineBuffer.ID_EOD) {
                    int data = operands.pop();
                    if (operands.isEmpty()) {
                        System.out.println("= " + data);
                    } else {
                        System.out.println("Invalid expression!");
                    }
                    operands.clear();
                    break;
                } else {
                    operands.push(value);
                }
            }
        }

    }
}

/*
Evaluation Rule:
1. operand는 무조건 스택에 push
2. operator경우 2개 pop한 후에 결과값을 push
 */
