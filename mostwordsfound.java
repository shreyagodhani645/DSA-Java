import java.util.Scanner;

public class mostwordsfound {

    public static void main(String[] args){
        System.out.println("Enter the sentence:"); 
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String[] sentences= name.split(",");

        int maxWords = 0;
        for(int i = 0; i < sentences.length; i++){
            int wordCount = sentences[i].trim().split("\\s+").length;
            if(wordCount > maxWords){
                maxWords = wordCount;
            }
        }
        System.out.println(maxWords);
    }
}
