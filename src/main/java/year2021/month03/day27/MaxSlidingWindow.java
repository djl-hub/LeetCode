package year2021.month03.day27;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author dujialun
 * @description
 * @data 2021/03/27 16/04
 */
class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 滑动窗口为1，直接返回nums
        if (k == 0) return null;
        if (k == 1) return nums;
        int i = 0, j = k-1;
        int n = 0;
        int[] result = new int[nums.length-k+1];
        int curmax = -100000;
        // i表示窗口头，j表示窗口尾
        while (j < nums.length ) {
            // 遍历找第一个滑动滑动窗口的最大值，并备份到curmax
            for (int x=i ; x <= j; i++) {
                return null;
            }
        }
        // 最外层for结束，滑动窗口到达尾部
        return result;
    }
    // 旋转链表
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        int len = 1;
        ListNode p = head;
        ListNode tail = null;
        while (p.next != null) {
            len++;
            p = p.next;
        }
        tail = p;
        // 防止链表长度小于k的情况出现
        k = k<len ? k:k%len;
        // 改循环链表
        p.next = head;
        p = head;
        for (int i = 0; i < k; i++) {
            p = p.next;
            tail = tail.next;
        }
        tail.next =  null;
        return p;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(nums));
    }
}
