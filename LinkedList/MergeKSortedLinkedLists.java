/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (int i = 0; i < lists.length; i++) {
            for (ListNode j = lists[i]; j != null; j = j.next) {
                pq.add(j);
            }
        }

        ListNode head = null;
        ListNode temp = null;

        if (pq.size() > 0) {
            temp = pq.remove();
            result = temp;
        }

        head = temp;
        while (pq.size() > 0) {
            temp = pq.remove();

            head.next = temp;
            head = temp;
        }
        if (temp != null)
            temp.next = null;
        return result;

    }
}
