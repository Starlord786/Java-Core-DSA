import java.util.Map;
import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "Shaban";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}