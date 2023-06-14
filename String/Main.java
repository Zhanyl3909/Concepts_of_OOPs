public class Main {
    public static void main(String[] args) {
        String x = "Hello";  //boxing
        String y = new String("World");

        String z;
        z = x + y;

        System.out.println(z);
        z = z + 123;  //gets as a String
        System.out.println(z);

        System.out.println(z.charAt(3));


        //compareTo()
        if(x.compareToIgnoreCase(y) > 0) {
            System.out.println(x + " is more");
        } else if (x.compareToIgnoreCase(y) < 0) {
            System.out.println(y.toLowerCase() + " is more ");
        } else {
            System.out.println("Same");
        }

        //Contains
        if(x.toLowerCase().contains("e")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        //endsWith
        if(z.endsWith("123")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
