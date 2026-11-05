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
    public boolean isPalindrome(ListNode head) {
        ListNode copy=new ListNode(head.val);
        ListNode temp=head.next;
        ListNode copytail=copy;

        while(temp!=null){
            copytail.next=new ListNode(temp.val);
            copytail=copytail.next;
            temp=temp.next;
        }

        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode ori=copy;
        ListNode rev=prev;
        while(ori!=null && rev!=null){
            if(ori.val!=rev.val){
                return false;
            }
            ori=ori.next;
            rev=rev.next;
        }
        return true;
    }
}