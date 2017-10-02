/* refer https://www.hackerrank.com/challenges/java-string-tokens/problem */
import java.util.*;

public class tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();
        if(s.length()==0){
            System.out.println("0");
        }
        String[] tokens = s.split("[ !,?._'@]+");
        int numTokens = tokens.length;
        System.out.println(tokens.length);
        for(int i=0;i<numTokens;i++){
            System.out.println(tokens[i]);
        }
        scan.close();
    }

}

