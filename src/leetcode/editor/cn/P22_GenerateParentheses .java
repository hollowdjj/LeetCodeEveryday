package leetcode.editor.cn;

import java.util.*;
import java.util.regex.Pattern;

public class ID22GenerateParentheses{
	public static void main(String[] args) {
		Solution solution = new ID22GenerateParentheses().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	List<String> ret = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
		doWork(0, 0, n, "");
		return ret;
    }

	private void doWork(int left, int right, int n, String prev) {
		if (prev.length() == n * 2) {
			ret.add(prev);
			return;
		}
		if (left < n) {
			prev += "(";
			doWork(left + 1, right, n, prev);
			prev = prev.substring(0, prev.length() - 1);
		}
		if (right < left) {
			prev += ")";
			doWork(left, right + 1, n, prev);
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
