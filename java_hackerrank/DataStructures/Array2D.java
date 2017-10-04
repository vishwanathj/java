/* refer https://www.hackerrank.com/challenges/java-2d-array */
import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=1; i < 5; i++ ) {
            for(int j=1; j < 5; j++) {
                int above = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1];
                int below = arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                int sum = above+arr[i][j]+below;
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
