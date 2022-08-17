package forEach;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int[][] arr = fillArray();
        printArray(arr);
        countOfElements(arr);
    }

    static int[][] fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void countOfElements(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        while (rows > 0 || columns > 0) {
            int number = array[rows - 1][columns - 1];
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (number == array[i][j]) {
                        count++;
                    }
                }
            }
            System.out.println(number + " appears " + count + " times");
            rows--;
            columns--;
        }
    }
}
