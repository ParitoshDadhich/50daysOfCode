class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddHead = odd;
        ListNode evenHead = even;
        
        while(even != null){
            odd.next = even.next;
            if(even.next != null)
                even.next = even.next.next;
            
            if(odd.next != null)
                odd = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;
        return oddHead;
    }
}
