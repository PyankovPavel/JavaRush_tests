import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class JavaRush_task0829_HashMap {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = fillTheMap();
        System.out.println(map);
        System.out.println(solution(map));
    }

    public static HashMap<String, String> fillTheMap() throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String city = br.readLine();
            if(city.equals("")) break;
            String surname = br.readLine();
            if(surname.equals("")) break;
            map.put(city, surname);
        }
        return map;
    }

    public static String solution(HashMap<String, String> map) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String city = br.readLine();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (city.equals(pair.getKey())) {
                return pair.getValue();
            }
        }
        return null;
    }
}
