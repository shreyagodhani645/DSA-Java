import java.util.Scanner;

public class freqAlphabets {
     public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter String");
    
        String s = myObj.nextLine();

        int str = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i = str - 1 ; i>=0 ; i--){
            if(s.charAt(i) != '#'){       //charAt s 8->2!=#
                sb.append((char)(s.charAt(i) - '0' + 96));
            } else {
                int num = Integer.parseInt(s.substring(i-2, i));
                sb.append((char)(num + 96));
                i -= 2;
            }
        }
        System.out.println(sb.reverse().toString());
    }
}