package Matrix;
import java.util.*;
public class GameOfLife {
    public static void gameOfLife(int [][] board)
    {
        int m=board.length;
        int n=board[0].length;
        int [][] temp = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int count = 0;
                // top case
                if(i-1>=0 && board[i-1][j]==1)
                {
                    count++;
                }
                // bottom case
                if(i+1<m && board[i+1][j]==1)
                {
                    count++;
                }
                // left
                if(j-1>=0 && board[i][j-1]==1)
                {
                    count++;
                }
                // right
                if(j+1<n && board[i][j+1]==1)
                {
                    count++;
                }
                // top left
                if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1)
                {
                    count++;
                }
                // bottom left
                if(i+1<m && j-1>=0 && board[i+1][j-1]==1)
                {
                    count++;
                }
                // top right
                if(i-1>=0 && j+1<n && board[i-1][j+1]==1)
                {
                    count++;
                }
                // bottom right
                if(i+1<m && j+1<n && board[i+1][j+1]==1)
                {
                    count++;
                }

                // now here i have to apply game of life rules
                if(board[i][j]==1)
                {
                    if(count<2)
                    {
                        temp[i][j] = 0;
                    }
                    else if(count==2 || count==3)
                    {
                        temp[i][j] =1;
                    }
                    else
                    {
                        temp[i][j] = 0;
                    }
                }
                else
                {
                    // here if my count = 3 then only 1
                    if(count==3)
                    {
                        temp[i][j] = 1;
                    }
                    else
                    {
                        temp[i][j] = 0;
                    }
                }

            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = temp[i][j];
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int m = sc.nextInt();
        System.out.println("Enter no. of cols ");
        int n = sc.nextInt();
        int [][] board = new int[m][n];
        System.out.println("Enter elements ");
        for(int i=0;i<m;i++)
        {
             for(int j=0;j<n;j++)
             {
                  board[i][j] = sc.nextInt();
             }
        }
        gameOfLife(board);
        System.out.println("The answer is : ");
        for(int i=0;i<m;i++)
        {
             for(int j=0;j<n;j++)
             {
                 System.out.println(board[i][j]);
             }
        }
    }
}
