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
    public ListNode middleNode(ListNode head) {
        int lengthList = 1;
        ListNode tempNode = head;
        while(tempNode.next != null){
            lengthList +=1;
            tempNode = tempNode.next;
        }
        int indexOfMidleElement = lengthList/2;
        tempNode = head;
            for(int index =0;tempNode.next != null; index++, tempNode=tempNode.next){
                if (index == indexOfMidleElement){
                    return tempNode;
                }
            }
        return tempNode;
    }
}