package leetcode.editor.cn;

import java.util.*;
public class ID39CombinationSum{
	public static void main(String[] args) {
		Solution solution = new ID39CombinationSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	List<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> path = new ArrayList<>();
		doWork(path, candidates, 0, 0, target);
		return ret;
    }

	private void doWork(List<Integer> path, int[] candidates, int index, int sum, int target) {
		if (sum == target) {
			ret.add(new ArrayList<>(path));
			return;
		} else if (sum > target) {
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			path.add(candidates[i]);
			doWork(path, candidates, i, sum + candidates[i], target);
			path.removeLast();
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
