package Merge_List;

public class Solution {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode();
        ListNode tail = answer;

        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else {

            while (list1 != null && list2 != null) {
                while (list2 != null && list2.val <= list1.val) {
                    //System.out.println(list2.val);
                    tail.next = list2;
                    list2 = list2.next;
                    tail = tail.next;
                }
                if(list2 == null){
                    break;
                }
                while (list1 != null && list1.val < list2.val) {
                    //System.out.println(list1.val);
                    tail.next = list1;
                    list1 = list1.next;
                    tail = tail.next;
                }
            }
            if (list1 == null && list2 != null) {
                    tail.next = list2;
            }
            if (list2 == null && list1 != null) {
                    tail.next = list1;
            }
            return answer = answer.next;
        }
    }
}

