import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[]{437, 54, 785, 92};
        System.out.println("The sum of the array is: " + sumArray(arrayNumbers));
        System.out.println("The minimum number is: " + minNumber(arrayNumbers));
    }

    // Getting the sum of the array
    public static int sumArray(int[] array){
        return Arrays.stream(array).sum();
    }

    // Getting the min number
    public static int minNumber(int[] array){
        return Arrays.stream(array).min().getAsInt();
    }
}