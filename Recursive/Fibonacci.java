
public class Fibo {

    static int fibo(int n)  {
        try {

            if(n == 0) return 1;
            if(n == 1) return 1;
            if(n > 0) return fibo(n-1) + fibo(n-2);


        } catch (Exception e) {

          System.out.println("error");
        }
        return 0;
    }
    public static void main(String[] args)  {
        for(int i=0; i<=10; i++) {
            System.out.println("F(" + i +") = " + fibo(i));
        }
    }
}
