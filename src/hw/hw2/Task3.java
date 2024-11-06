//Дан следующий код, исправьте его там, где требуется

package hw.hw2;

public class Task3 {
    public static void main(String[] args) throws Exception {

        int a = 90;
        int b = 3;
        if (b != 0) {
            System.out.println(a / b);
        }

        printSum(23, 234);
        int[] abc = {1, 2};
        if (3 < abc.length) {
            abc[3] = 9;
        } else {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}