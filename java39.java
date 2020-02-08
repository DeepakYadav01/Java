import java.util.*;
public class Solution {


    static int alternatingCharacters(String s) {
        int count=0;


        	 for(int i=0;i<s.length()-1;i++){
                 if(s.charAt(i)==s.charAt(i+1))
                     count++;
             }

           return count;

    }


    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter Testcase");
        int q = scanner.nextInt();

        for (int i = 0; i< q+1; i++) {

        	if(i!=0)
        	System.out.println("Enter String");
            String s = scanner.nextLine();

            if(i!=0) {
            	int result = alternatingCharacters(s);
                System.out.print(result+"\n");
            }


        }

    }
}
