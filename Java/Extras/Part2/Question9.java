import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Question9 {
     public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int targetSum = 7;
        
        List<List<Integer>> pairs = findPairsWithSum(nums, targetSum);
        
        System.out.println("Pairs with sum equal to " + targetSum + ":");
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
    
    public static List<List<Integer>> findPairsWithSum(int[] nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            int complement = targetSum - num;
            if (map.containsKey(complement)) {
                List<Integer> pair = Arrays.asList(num, complement);
                result.add(pair);
            }
            map.put(num, num);
        }
        
        return result;
    }
}
