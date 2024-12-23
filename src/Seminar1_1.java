/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1 в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
        3. если вместо массива пришел null, метод вернет -3
        4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
        Напишите метод, в котором реализуете взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый метод, обработает
возвращенное значение и покажет читаемый результат пользователю. Например, если
вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.*/

public class Seminar1_1 {
    public static void main(String[] args) {
        int[] arr = null;
        int element = 3;
        int result = serchElement(arr, element);
        if (result == -1) {
            System.out.println("Длина массива меньше 3");
        } else if (result == -2) {
            System.out.println("Искомый элемент не найден");
        } else if (result == -3) {
            System.out.println("Массив не передан");
        } else {
            System.out.printf("искомый элемент имеет индекс %d", result);
        }
    }

    public static int serchElement(int[] arr, int element) {
        if (arr == null) {
            return -3;
        }
        int minLenght = 3;
        if (arr.length < minLenght) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -2;
    }
}
