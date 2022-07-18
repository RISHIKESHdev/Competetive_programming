public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy=headA;
        int m=0;
        while(dummy!=null){
            dummy=dummy.next;
            m++;
        }
        int n=0;
        dummy=headB;
        while(dummy!=null){
            dummy=dummy.next;
            n++;
        }
        // Offsetting the larger linked list
        if(m>n){
            int diff=m-n;
            while(diff>0){
                headA=headA.next;
                diff--;
            }
        }
        else{
            int diff=n-m;
            while(diff>0){
                headB=headB.next;
                diff--;
            }
        }
        
        while(headA!=null&&headB!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
