import java.util.HashSet;
import java.util.Scanner;

public class morsecode {
    static String morseEncode(char x) {
        switch (x) {
            case 'a': return ".-";
            case 'b': return "-...";
            case 'c': return "-.-.";
            case 'd': return "-..";
            case 'e': return ".";
            case 'f': return "..-.";
            case 'g': return "--.";
            case 'h': return "....";
            case 'i': return "..";
            case 'j': return ".---";
            case 'k': return "-.-";
            case 'l': return ".-..";
            case 'm': return "--";
            case 'n': return "-.";
            case 'o': return "---";
            case 'p': return ".--.";
            case 'q': return "--.-";
            case 'r': return ".-.";
            case 's': return "...";
            case 't': return "-";
            case 'u': return "..-";
            case 'v': return "...-";
            case 'w': return ".--";
            case 'x': return "-..-";
            case 'y': return "-.--";
            case 'z': return "--..";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] stringArray = new String[size];
        System.out.println("Enter " + size + " strings:");

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }
        
        
        HashSet<String> map = new HashSet<>();
        
        for(int i = 0; i < stringArray.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < stringArray[i].length(); j++){
              sb.append(morseEncode(stringArray[i].charAt(j)))  ;
            }
            map.add(sb.toString());
        }
            System.out.println(map.size());
    }
}