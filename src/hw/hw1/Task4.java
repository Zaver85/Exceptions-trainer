package hw.hw1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = {8, 15, 16};
        int[] arr2 = {4, 0, 2};
        try {
            int[] result = divArray(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int[] divArray(int[] arr1, int[] arr2) throws RuntimeException {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массив имеет разную длину");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на 0");
            } else {
                result[i] = arr1[i] / arr2[i];
            }
        }
        return result;


    }
}
