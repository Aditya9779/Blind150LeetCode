import java.util.Arrays;

public class Longest_Increasing_Subsequence {

    public static int lengthOfLIS(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int dp[] = new int[nums.length];
        //Fill the array with the 1
        Arrays.fill(dp, 1);
        //Finding the range of the number of the array
        // To fill it
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return Arrays.stream(dp).max().orElse(0);
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(arr));
    }
}
