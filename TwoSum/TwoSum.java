import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int target = sc.nextInt();
        System.out.println("Please enter length of Integer array");
        int length = sc.nextInt();
        int[] nums = new int[length];

        // loop over array to save user input
        System.out.println("Please enter array elements");
        for (int i = 0; i < length; i++) {
            int userInput = sc.nextInt();
            nums[i] = userInput;
        }
        sc.close();
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int halfNum = target - nums[i];
            if (numbers.containsKey(halfNum)) {
                var res = new int[] { numbers.get(halfNum), i };
                System.out.println(Arrays.toString(res));
            }
            numbers.put(nums[i], i);
        }
    }
}