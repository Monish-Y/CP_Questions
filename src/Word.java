import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int lwr = 0;
        int upr = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90)
                upr = upr+1;
            else
                lwr = lwr+1;
        }
        if(upr>lwr)
        {
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println(str.toLowerCase());
        }
    }
}
