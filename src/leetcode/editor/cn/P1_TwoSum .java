package leetcode.editor.cn;

import java.util.*;
public class ID1TwoSum{
	public static void main(String[] args) {
		Solution solution = new ID1TwoSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
		int[] ret = new int[2];
		Map<Integer, Integer> dic = new HashMap<>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (dic.containsKey(target - nums[i])) {
				ret[0] = dic.get(target - nums[i]);
				ret[1] = i;
				return ret;
			}
			dic.put(nums[i], i);
		}
		return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
