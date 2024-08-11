import java.util.Arrays;
import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        String str = in.next();
        char[] arr = str.toCharArray();
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<n-1;) {
                if (arr[j] == 'B' && arr[j + 1] == 'G') {
                    arr[j] = 'G';
                    arr[j+1] = 'B';
                    j=j+2;
                }
                else {
                    j++;
                }
            }
        }
        String str1 = "";
        for(int i=0;i<n;i++)
        {
            str1 = str1+arr[i];
        }
        System.out.println(str1);

    }
}
