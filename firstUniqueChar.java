import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.LinkedHashMap;

public class firstUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string ");
        String s = sc.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        Set<Character> keys = map.keySet();

        char chr1 = ' ';
        for (Character key : keys) {
            if(map.get(key)== 1){
                 chr1 = (key);
                break;
            }
        }
        System.out.println(s.indexOf(chr1));
    }
}