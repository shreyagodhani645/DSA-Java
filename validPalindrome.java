import java.util.Scanner;

public class validPalindrome {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));
        }
        String regex = "[, : | . ;  ]";
        String clean = sb.toString().replaceAll(regex,"").toLowerCase();

        if(clean.length()%2 == 0){
          for(int i = 0; i < clean.length()/2; i++){
            if(clean.charAt(i) == clean.charAt(clean.length()-(i+1))){
              System.out.println(clean.charAt(i));
            }else{
              System.out.println(clean.charAt(i)+"false"+clean.charAt(clean.length()-(i+1)));
            }            
          }
          
        } else {
          for(int i = 0; i < clean.length()/2 - 1; i++){
            if(clean.charAt(i) == clean.charAt(clean.length()-(i+1))){
            }  
            else{
              System.out.println("false");
              break;
            }  

          }
          System.out.println("true");
      }
  }
}