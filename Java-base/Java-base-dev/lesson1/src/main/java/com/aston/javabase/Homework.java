package com.aston.javabase;

public class Homework {

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        String[] arrStr = string.split("");
        for (int i = arrStr.length - 1; i >= 0; i--) {
            System.out.printf("%s", arrStr[i]);
        }
        System.out.println();
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
        int prevEl = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] != prevEl) {
                System.out.printf("%d ", prevEl);
                prevEl = ints[i];
            }
        }
        System.out.println();
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        int max = arr[0];
        int prevMax = arr[1];
        if (prevMax > max) {
            int tmp = prevMax;
            prevMax = max;
            max = tmp;
        }
        for (int i = 2; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] > prevMax) {
                prevMax = arr[i];
            }
        }
        return prevMax;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        int lenLast;
        String[] arrStr;
        string = string.trim();
        arrStr = string.split(" +");
        lenLast = arrStr[arrStr.length - 1].length();
        return lenLast;
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        int i, j;
        boolean flag = true;
        for (i = 0, j = string.length(); i < j; i++, j--) {
            String first = string.substring(i, i + 1);
            String last = string.substring(j - 1, j);
            if (!first.equals(last)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
