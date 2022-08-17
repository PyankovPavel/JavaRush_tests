package forEach;

import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        int[] array = fillArray();
        printArray(array);
        countOfElements(array);
    }

    static int[] fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int m = sc.nextInt();
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void countOfElements(int[] array) {
        int checkNumber = 0;
        int count = 0;
        while (checkNumber < 11) {
            for (int number : array) {
                if (number == checkNumber) {
                    count++;
                    System.out.println(number + " " + count + " times");
                }
            }
            checkNumber++;
            count = 0;
        }

    }
}
