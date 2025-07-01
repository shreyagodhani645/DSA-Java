import java.util.Scanner;

class ipadd {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter IP address");
    
    String ip = myObj.nextLine();
    System.out.println(ip.replace(".","[.]")); 
  }
}