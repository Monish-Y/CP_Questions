import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] mat = new int[5][5];
        int r = 0;
        int c = 0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                mat[i][j] = in.nextInt();
                if(mat[i][j]==1)
                {
                    r=i+1;c=j+1;
                }
            }
        }
        if(r==3 && c==3)
        {
            System.out.println(0);
            return;
        }
        int r_move = (r>3)?r-3:3-r;
        int c_move = (c>3)?c-3:3-c;
        System.out.println(r_move+c_move);
    }
}
