import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        int[][] array = fillArray();
        printArray((array));
        deleteRowColumnWithMinElement(array, findMinElement(array));
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
                array[i][j] = (int) (Math.random() * 100);
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

    static int[] findMinElement(int[][] array) {
        int min = array[0][0];
        int indexIOfMin = 0;
        int indexJOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    indexIOfMin = i;
                    indexJOfMin = j;
                }
            }
        }
        int[] indexes = {indexIOfMin, indexJOfMin};
        System.out.println("Min element is " + min + ", i = " + indexIOfMin + ", j = " + indexJOfMin);
        System.out.println(Arrays.toString(indexes));
        return indexes;
    }

    static void deleteRowColumnWithMinElement(int[][] array, int[] indexes) {
        for (int i = 0; i < array.length; i++) {
            if (i != indexes[0]) {
                for (int j = 0; j < array[0].length; j++) {
                    if (j != indexes[1]) {
                        System.out.print(array[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        }
    }
}