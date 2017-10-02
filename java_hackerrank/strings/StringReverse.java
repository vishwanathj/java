/* refer https://www.hackerrank.com/challenges/java-string-reverse */
import java.util.*;
public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(A.contentEquals(new StringBuffer(A).reverse().toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
