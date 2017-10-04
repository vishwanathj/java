/* https://www.hackerrank.com/challenges/phone-book */
import java.util.*;

public class Map {
    public static void main(String []argh)
    {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            hm.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            try {
                int num = hm.get(s);
                System.out.println(s+"="+num);
            } catch (NullPointerException e){
                System.out.println("Not found");
            }
        }
    }
}
