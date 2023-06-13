public class Main {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>(10);
        Stack<Double> b = new Stack<>(20);
        Stack<String> c = new Stack<>(10);

        a.push(1);
        b.push(99.9);
        c.push("Zhanylai");
        c.push("Dzholchieva");

        System.out.println(a.pop());
        System.out.println(b.pop());
        System.out.println(c.pop());
    }
}
