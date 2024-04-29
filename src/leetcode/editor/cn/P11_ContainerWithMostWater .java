package leetcode.editor.cn;

import java.util.*;
public class ID11ContainerWithMostWater{
	public static void main(String[] args) {
		Solution solution = new ID11ContainerWithMostWater().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
		/*
		 * 面积公式：area = Min(height[left], height[right]) * (right - left)
		 * 1. 若移动短板，虽然距离缩短，但是可能下一个是长板，进而面积增大。
		 * 2. 若移动长板，距离缩短，由于短板不变，因此面积一定缩小。
		 * 3. 若两板一样长，则随便移动一个都可
		 */
		int left = 0, right = height.length - 1;
		int ret = 0;
		while (left < right) {
			int area = Math.min(height[left], height[right]) * (right - left);
			ret = Math.max(ret, area);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
