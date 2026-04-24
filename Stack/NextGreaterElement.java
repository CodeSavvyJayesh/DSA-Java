package Stack;
import java.util.*;
public class NextGreaterElement {
    public static ArrayList<Integer> greaterElement(int [] nums)
    {
        int n=nums.length;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
             // we have to check whether stack is empty or not
            // if its not empty and the peek smaller than current element then we have to pop
            while(!stack.isEmpty() && stack.peek()<nums[i])
            {
                 stack.pop();
            }
            if(stack.isEmpty())
            {
                 list.add(-1);
            }
            else
            {
                 list.add(stack.peek());
            }
            stack.push(nums[i]);
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i] = sc.nextInt();
        }
        // now we need to call the function
        ArrayList<Integer> ans = greaterElement(nums);

        System.out.println("The greater elements are : ");
        for(int x:ans)
        {
             System.out.println(x+ "");
        }

    }
}
