import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Solution {
	public int[] twoSum(int[] nums , int target){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums.length;i++){
			map.put(nums[i], i);
		}
		for(int i=0; i<nums.length;i++){
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if(entry.getValue() == i){
					continue;
				}
				if(entry.getKey()+ nums[i] == target){
					return new int[]{Integer.valueOf(entry.getValue()), i};
				}
			}
		}
		return null;
	}

	public static void main(String[] args){
		int[] result = new Solution().twoSum(new int[]{3,2,4}, 6);
		System.out.println(Arrays.toString(result));
	}
}