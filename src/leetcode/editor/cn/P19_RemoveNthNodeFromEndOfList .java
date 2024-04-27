package leetcode.editor.cn;

import java.util.*;
import java.util.regex.Pattern;

public class ID19RemoveNthNodeFromEndOfList{
	public static void main(String[] args) {
		Solution solution = new ID19RemoveNthNodeFromEndOfList().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummyHead = new ListNode(0, head);
		ListNode fast = head;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		ListNode slow = head;
		ListNode prev = dummyHead;
		while (fast != null) {
			fast = fast.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = slow.next;
		return dummyHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
