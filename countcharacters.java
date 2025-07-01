import java.util.HashMap;
import java.util.Scanner;

public class countcharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] stringArray = new String[size];
        System.out.println("Enter " + size + " Strings: ");

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine(); // [cat,bt,hat,tree]
        }
        System.out.println("Enter string");
        String s = scanner.nextLine(); // [atach]

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {
                map.put((s.charAt(i)), map.get(s.charAt(i)) + 1);
            } else {
                map.put((s.charAt(i)), 1);
            }
        }

        System.out.println(map);
        int len = 0;
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < stringArray.length; i++) {

            map2.clear();
            map2.putAll(map);
            int j = 0;
            for (; j < stringArray[i].length(); j++) {
                if (map2.containsKey(stringArray[i].charAt(j))) {
                    map2.put(((stringArray[i].charAt(j))), map2.get((stringArray[i].charAt(j))) - 1);

                    if (map2.get(stringArray[i].charAt(j)) < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }

            if (j == stringArray[i].length()) {
                len += stringArray[i].length(); // word can be fully formed
            }
            System.out.println(len);

        }
        System.out.println(map2);
        System.out.println(len);
    }
}
