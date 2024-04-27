package leetcode.editor.cn;

import java.security.InvalidKeyException;
import java.util.*;
public class ID15ThreeSum{
	public static void main(String[] args) {
		Solution solution = new ID15ThreeSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length;
		List<List<Integer>> ret = new ArrayList<>();
		for (int i = 0; i < n - 2; i++) {
			// 去重
			if (i > 0 && nums[i - 1] == nums[i]) {
				continue;
			}
			int left = i + 1;
			int right = n - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum > 0) {
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					ret.add(Arrays.asList(nums[i], nums[left], nums[right]));
					// 去重
					left++;
					while (left < right && nums[left - 1] == nums[left]) {
						left++;
					}
					right--;
					while (left < right && nums[right + 1] == nums[right]) {
						right--;
					}
				}
			}
		}
		return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
