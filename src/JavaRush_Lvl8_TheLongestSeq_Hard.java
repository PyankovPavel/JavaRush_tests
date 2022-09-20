import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JavaRush_Lvl8_TheLongestSeq_Hard {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = fillTheList();
        System.out.println(list);
        System.out.println(Solution(list));
    }

    public static ArrayList<Integer> fillTheList() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Write smth: ");
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        return list;
    }

    public static int Solution(ArrayList<Integer> list) {
        int count = 1;
        int result = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1)) {
                count++;
            } else {
                if (result > count) {
                    count = 1;
                } else {
                    result = count;
                    count = 1;
                }
            }
        }
        return result;
    }

}
