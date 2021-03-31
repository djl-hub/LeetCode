package year2021.month03.day26;

/**
 * @author dujialun
 * @description
 * @data 2021/03/26 10/15
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        ListNode p = cur.next;
        while (p != null) {
            // 值相同，p跳过
            if ( cur.val == p.val){
                p = p.next;
                cur.next = p;
            }else { // 值不同，同步前移
                p = p.next;
                cur = cur.next;
            }
        }
        return head;
    }
}

