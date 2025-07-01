import java.util.Scanner;

public class reverseVowels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the string: ");
    String s = sc.nextLine();

    StringBuilder str = new StringBuilder(s);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
          c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        sb.append(str.charAt(i));
      }
    }
    sb.reverse();
    System.out.println(sb);
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
          c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        str.setCharAt(i, sb.charAt(0));
        sb.deleteCharAt(0);
      }
    }
    System.out.println(str.toString());
  }
}