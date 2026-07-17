
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node to simplify the merge process
        ListNode dummy = new ListNode(-1);

        // Pointer to build the merged list
        ListNode current = dummy;

        // Compare nodes from both lists until one list becomes empty
        while (list1 != null && list2 != null) {

            // If list1's value is smaller, attach it
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            }
            // Otherwise attach list2's node
            else {
                current.next = list2;
                list2 = list2.next;
            }

            // Move current pointer forward
            current = current.next;
        }

        // Attach the remaining nodes (only one list can have nodes left)
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list (skip dummy node)
        return dummy.next;
    }
}
