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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=list1;
        List<Integer> l=new ArrayList<>();
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        temp=list2;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(l);
        ListNode dummy=new ListNode(-1);
          ListNode tail=dummy;
        for(int v:l){
            ListNode n=new ListNode(v);
            tail.next=n;
            tail=n;
            
        }
        return dummy.next;
    }
}