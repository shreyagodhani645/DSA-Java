import java.util.Scanner;

public class sortSentence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter string: ");
    String s = sc.nextLine();

    String[] newstr = s.split(" ");
    String[] result = new String[newstr.length];

    for (int i = 0; i < newstr.length; i++) {
      for (int j = 0; j < newstr[i].length(); j++) {
        if (Character.isDigit(newstr[i].charAt(j))) {
          int pos = newstr[i].charAt(j) - '0'; 
          String clean = newstr[i].replaceAll("[0-9]", ""); 
          result[pos - 1] = clean; 
          break; 
      }
    }
  }
  String finalSentence = String.join(" ", result);
  System.out.println(finalSentence);
}
}
