package leetcode.editor.cn;

import java.util.*;
public class ID3LongestSubstringWithoutRepeatingCharacters{
	public static void main(String[] args) {
		Solution solution = new ID3LongestSubstringWithoutRepeatingCharacters().new Solution();
		StringBuilder sb = new StringBuilder();

		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> dic = new HashMap<>();
		int ret = 0;
		int n = s.length();
		int left = 0, right = 0;
		while (right < n) {
			Character c = s.charAt(right);
			if (dic.containsKey(c)) {
				left = Math.max(left, dic.get(c) + 1);
			}
			ret = Math.max(right - left + 1, ret);
			dic.put(c, right);
			right++;
		}
		return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
