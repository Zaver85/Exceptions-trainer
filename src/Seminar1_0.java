/*Реализуйте метод, принимающий в качестве аргумента
целочисленный массив.
Если длина массива меньше некоторого заданного минимума,
метод возвращает -1 в качестве кода ошибки, иначе - длину
        массива*/


public class Seminar1_0 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int minLengtht = 5;
        int result = checkArrayLenght(arr, minLengtht);
        System.out.println(result);

    }

    public static int checkArrayLenght(int[] arr, int minLenght) {
        if (arr.length < minLenght) {
            return -1;
        } else {
            return arr.length;
        }
    }
}
