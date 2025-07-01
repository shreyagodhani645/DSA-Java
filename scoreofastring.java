import java.util.Scanner;

public class scoreofastring {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter any String");
    
    String ip = myObj.nextLine();
    String iplower = ip.toLowerCase();

    int sum = 0;
    for (int i = 0; i < iplower.length() - 1; i++){
        sum = sum + Math.abs(iplower.charAt(i) - iplower.charAt(i+1));
    }
    System.out.println(sum);
    }
  }
