package leetcode.editor.cn;

import java.util.*;
public class ID5LongestPalindromicSubstring{
	public static void main(String[] args) {
		Solution solution = new ID5LongestPalindromicSubstring().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
		/*
		 * dp[i][j]表示s[i:j]是否是回文字符串:
		 *
		 * 状态转移方程：dp[i][j] = s[i] == s[j] && dp[i + 1][j - 1]
		 * 由于状态转移方程涉及dp[i + 1][j - 1]，因此应该从后往前遍历。
		 */
		int n = s.length();
		boolean[][] dp = new boolean[n][n];
		int left = 0, right = 0;
		int maxLen = 0;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1])) {
					dp[i][j] = true;
					if (j - i + 1 > maxLen) {
						maxLen = j - i + 1;
						left = i;
						right = j;
					}
				}
			}
		}
		return s.substring(left, right + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
