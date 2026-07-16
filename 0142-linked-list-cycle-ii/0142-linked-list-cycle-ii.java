/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // If the list is empty or has only one node, no cycle exists.
        if(head == null || head.next == null){
            return null;
        }
        // set
        ListNode slow = head;
        ListNode fast = head;

        // if the cycle exist
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                // Step 2: Move slow to the head
                slow = head;

                // Step 3: Move both one step at a time.
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;

            }
            
        }
        // No cycle found
        return null;

    }
}