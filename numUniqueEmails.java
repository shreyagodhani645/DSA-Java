import java.util.Scanner;
import java.util.HashSet;

public class numUniqueEmails {
  public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = myObj.nextInt();
        myObj.nextLine(); 

        String[] emails = new String[n];
        System.out.println("Enter the strings:");
        for(int a = 0; a < n; a++) {
            emails[a] = myObj.nextLine();
        }

        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            StringBuilder sb = new StringBuilder();

            int index1 = -1;
            int index2 = -1;
            for (int j = 0; j < emails[i].length()-4; j++) {
                char chr1 = emails[i].charAt(j);
                if (chr1 != '.') {
                 sb.append(chr1);
                }
                // if (chr1 == '+'){
                //     index1 = emails[i].indexOf(chr1);
                // }
                // if (chr1 == '@'){
                //     index2 = emails[i].indexOf(chr1);
                // }
            }
            index1 = sb.toString().indexOf('@');
            index2 = sb.toString().indexOf('+');
            System.out.println(index1+"fds"+index2);
            if (index2 != -1 && index1 != -1 && index2 < index1) {
            sb.replace(index2,index1,"");
            }
            hs.add(sb.toString());
            System.out.println(sb.toString());  
        }
        System.out.println(hs.size());
  }
}