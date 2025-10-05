package linkedlist;

public class RemoveFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode fast = dummy;
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }

}
