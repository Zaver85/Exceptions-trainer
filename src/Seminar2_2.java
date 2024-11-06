/*Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
        Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap).
В отдельном методе нужно будет пройти по структуре данных.
Если сохранено значение ?, заменить его на соответствующее число.
Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
Записать в тот же файл данные с замененными символами ?.*/


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Seminar2_2 {
    public static void main(String[] args) {
        String filePath = "src/Seminar2_2_data.txt"; // Убедитесь, что путь к файлу правильный
        HashMap<String, Integer> map = readData(filePath);
        writeData(filePath, map);
    }

    public static void writeData(String fileName, HashMap<String, Integer> map) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file, false); // Включаем режим перезаписи

            for (String name : map.keySet()) {
                Integer value = map.get(name);
                writer.write(name + "=" + value + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи!");
        }
    }

    public static HashMap<String, Integer> readData(String fileName) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("=");
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Неверные данные в строке: " + line);
                }
                String name = parts[0];
                String value = parts[1].trim();
                int valueInt;
                if (value.equals("?")) {
                    valueInt = name.length();
                } else {
                    try {
                        valueInt = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Неверный формат числа в строке: " + line, e);
                    }
                }
                map.put(name, valueInt);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
        return map;
    }
}

