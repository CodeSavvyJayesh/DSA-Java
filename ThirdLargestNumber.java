import java.util.*;

public class ThirdLargestNumber {

    public static int thirdLargest(int[] nums) {

        int n = nums.length;

        if (n < 3) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : nums) {

            if (num > largest) {

                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {

                thirdLargest = secondLargest;
                secondLargest = num;

            } else if (num > thirdLargest &&
                    num != largest &&
                    num != secondLargest) {

                thirdLargest = num;
            }
        }

        return thirdLargest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = thirdLargest(nums);

        System.out.println("Third Largest = " + ans);
    }
}