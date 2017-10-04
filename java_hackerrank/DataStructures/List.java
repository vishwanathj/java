/*refer https://www.hackerrank.com/challenges/java-list/problem */
import java.util.*;

public class List {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        ArrayList l = new ArrayList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            l.add(i,sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            String s=sc.next();
            if(s.equals("Insert"))
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                l.add(x,y);
            }
            else if(s.equals("Delete"))
            {
                int x = sc.nextInt();
                l.remove(x);
            }
        }
        Iterator it = l.iterator();
        while(it.hasNext())
        {
            Integer ir = (Integer)it.next();
            System.out.print(ir+" ");
        }
    }
}
