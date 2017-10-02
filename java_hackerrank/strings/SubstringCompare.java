/*refer https://www.hackerrank.com/challenges/java-string-compare?h_r=next-challenge&h_v=zen */
import java.util.*;

public class SubstringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++) {
            sets.add(s.substring(i, i + k));
        }
        smallest = sets.first();
        largest = sets.last();
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
