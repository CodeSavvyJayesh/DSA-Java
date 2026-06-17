package BinarySearch;
import java.util.*;
public class searchIn2DMatrix {
    public static boolean isPresent(int [][] matrix,int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        // we have to think about rows and cols
        int low = 0;
        int high = row*col-1;
        while(low<=high)
        {
             // I have to think about when the condition will hit
            int mid = low + (high-low)/2;
            // instantly calc row and col
            int rows = mid/col;
            int cols = mid%col;
            if(matrix[rows][cols]==target)
            {
                 return true;
            }
            else if(matrix[rows][cols]<target)
            {
                 low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int m = sc.nextInt();
        System.out.println("ENter no. of cols");
        int n = sc.nextInt();
        // enter the elemetns
        int [][] matrix = new int[m][n];
        System.out.println("Enter the elements ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target element ");
        int target = sc.nextInt();
        boolean ans = isPresent(matrix,target);
        System.out.println("The answer is :" + ans);

    }
}
