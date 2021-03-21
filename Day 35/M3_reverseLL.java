public class Solution {
    
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if(head == null || head.next == null)
            return head;
        
        LinkedListNode<Integer> tail = head.next;
        LinkedListNode<Integer> ansHead = reverseLinkedListRec(head.next);
        tail.next = head;
        head.next = null;
        
        return ansHead;
    }
}

