import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        //Sort
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
