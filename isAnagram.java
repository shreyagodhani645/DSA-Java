import java.util.Arrays;
import java.util.Scanner;

public class isAnagram {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st string: ");
        String s = sc.nextLine();  

        System.out.print("Enter 2nd string: ");
        String t = sc.nextLine();  

       

        String opstr1 = sortString(s);
        String opstr2 = sortString(t);

        if(opstr1.equals(opstr2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
  }
   public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}