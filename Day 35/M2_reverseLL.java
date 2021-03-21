
public class Solution {
    
    static class Pair{
        LinkedListNode<Integer> head;
        LinkedListNode<Integer> tail;
        
        Pair(){
            head = null;
            tail = null;
        }
    }
    
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        return helper(head).head;
    }
    
    private static Pair helper(LinkedListNode<Integer> head){
        
        
        if(head == null || head.next == null){
            Pair temp = new Pair();
            temp.head = head;
            temp.tail = head;
            return temp;
        }
        
        Pair ans = helper(head.next);
        if(ans.tail != null){
        	ans.tail.next = head;
            ans.tail = head;
        }
        head.next = null;
        return ans;
    }
}
