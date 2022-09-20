import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JavaRush_Lvl7_ArrayLists_Hard {
    public static ArrayList<String> fillTheList() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        return list;
    }

    public static String solution(ArrayList<String> list) {
        int minLenght = list.get(0).length();
        int maxLength = list.get(0).length();
        int indexOfMin = 0;
        int indexOfMax = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minLenght) {
                minLenght = list.get(i).length();
                indexOfMin = i;
            } else if (list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
                indexOfMax = i;
            }
        }
        if (indexOfMin < indexOfMax) {
            return list.get(indexOfMin);
        } else {
            return list.get(indexOfMax);
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = fillTheList();
        System.out.println(strings);
        System.out.println(solution(strings));
    }
}
