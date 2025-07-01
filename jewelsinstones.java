import java.util.Scanner;

public class jewelsinstones {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter jewels, stones");

        String jewels = myObj.nextLine();
        String stones = myObj.nextLine();

        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            if(jewels.indexOf(stones.charAt(i)) != -1) {
                count++ ;
            }
        }
        System.out.println(count); 
    }
}
