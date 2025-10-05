package linkedlist;

import java.util.HashSet;

public class LinkedListCycle {

    //Cach 1 dung HashSet
//    public boolean hasCycle(ListNode head) {
//        HashSet<ListNode> check = new HashSet<>();
//        ListNode curr = head;
//        while(curr != null){
//            if (check.contains(curr)) return true;
//            check.add(curr);
//            curr = curr.next;
//        }
//        return false;
//    }

    //Cach 2: two pointer
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
