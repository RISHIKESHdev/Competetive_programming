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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s=new StringBuilder();
        while(l1!=null){
            s.append(Integer.valueOf(l1.val));
            l1=l1.next;
        }
        long num1=Long.parseLong(s.reverse().toString());
        s=new StringBuilder();
        while(l2!=null){
            s.append(Integer.valueOf(l2.val));
            l2=l2.next;
        }
        long num2=Long.parseLong(s.reverse().toString());
        long sum=num1+num2;
        ListNode node=new ListNode(0);
        ListNode result=node;
        while(sum>0){
            node.next=new ListNode((int)(sum%10));
            sum/=10;
            node=node.next;
        }
        return (num1+num2==0)?result:result.next;
    }
}
