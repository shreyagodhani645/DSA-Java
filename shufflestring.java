import java.util.Scanner;

public class shufflestring {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string, indices");

        String s = myObj.nextLine();

        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
           arr[i]= myObj.nextInt();
        }
        
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(arr[i]));
        }
            System.out.println(sb);
    }
}
