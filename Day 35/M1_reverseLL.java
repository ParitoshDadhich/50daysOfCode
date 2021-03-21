public class Solution {
    
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        
        if(head == null || head.next == null)
            return head;
        
        // 1 2 3 4 5 
        // 5 4 3 2 after making a recursive call
        LinkedListNode<Integer> ansHead = reverseLinkedListRec(head.next);
        
        LinkedListNode<Integer> temp = head;
        while(temp.next != null)
            temp = temp.next;
        
        temp.next = head;
        head.next = null; // 5 4 3 2 1
        
        return ansHead;
    }
}
