public class Solution {

    public boolean hasCycle(ListNode head) {

        // If the linked list is empty
        // OR there is only one node,
        // then a cycle is impossible.
        if (head == null || head.next == null)
            return false;

        // Slow pointer starts from the head.
        ListNode slow = head;

        // Fast pointer also starts from the head.
        ListNode fast = head;

        // Continue until fast reaches the end.
        while (fast != null && fast.next != null) {

            // Slow moves one step.
            slow = slow.next;

            // Fast moves two steps.
            fast = fast.next.next;

            // If both pointers point to the same node,
            // a cycle exists.
            if (slow == fast)
                return true;
        }

        // Fast reached the end,
        // so there is no cycle.
        return false;
    }
}