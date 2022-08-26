import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class print {
    public static void main(String[] args) throws InterruptedException {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2*i-1;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int s = Arrays.binarySearch(arr, 4, 5, 11);
        System.out.println(s);
    }
}