package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringOutput {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        String str = "aabbcccdd";
        String nstr = " ";
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(i, 0) + 1);

        }
        for (int j = 0; j < map.size(); j++) {
            nstr = nstr + map.getOrDefault(j, 0);
        }
        System.out.println("New String is : " + nstr);
    }

}
