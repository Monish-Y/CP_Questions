import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for(int i=0;i<str.length();)
        {
            if(str.charAt(i)=='.')
            {
                System.out.print(0);
                i++;
            }
            else if(str.charAt(i)=='-'&&str.charAt(i+1)=='.')
            {
                System.out.print(1);
                i=i+2;
            }
            else if(str.charAt(i)=='-'&&str.charAt(i+1)=='-')
            {
                System.out.print(2);
                i=i+2;
            }
        }
    }
}
