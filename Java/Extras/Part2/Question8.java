import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 6, 6};
        
        int newLength = removeDuplicates(nums);
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.println("New length of the array: " + newLength);
    }
    
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[length++] = nums[i];
            }
        }
        
        return length;
    }
}
