/* check the problem description at https://www.hackerrank.com/challenges/java-loops/problem */
//import com.sun.deploy.util.StringUtils;

import java.util.*;

public class LoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int [] res = new int[n];
            int prev = a;
            for(int k=0;k<n;k++){
                res[k] = prev + (int)Math.pow(2, k)*b;
                prev = res[k];
                //System.out.println(prev);
            }
            System.out.println(Arrays.toString(res).replaceAll(", "," ").
                    replace("[","").
                    replace("]","")
            );
        }
        in.close();
    }
}