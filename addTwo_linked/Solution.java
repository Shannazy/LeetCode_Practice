package addTwo_linked;


//* Definition for singly-linked list.
class ListNode {
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

//*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode outPut = new ListNode();
        ListNode head = outPut;
        int carry = 0;
        int sum;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                if (carry == 0) {
                    head.next = l2;
                    break;
                } else {
                    carry = (carry + l2.val) / 10;
                    head.next = new ListNode((carry + l2.val) % 10);
                    head = head.next;
                    l2 = l2.next;
                }
            } else if (l2 == null) {
                if (carry == 0) {
                    head.next = l1;
                    break;
                } else {
                    head.next = new ListNode((carry + l1.val) % 10);
                    carry = (carry + l1.val) / 10;
                    head = head.next;
                    l1 = l1.next;
                }
            } else {
                sum = carry + l1.val + l2.val;
                if (sum < 10) {
                    head.next = new ListNode(sum);
                    head = head.next;
                    carry = 0;
                    l1 = l1.next;
                    l2 = l2.next;
                } else {
                    carry = 1;
                    head.next = new ListNode(sum%10);
                    head = head.next;
                    l1 = l1.next;
                    l2 = l2.next;
                }

            }
        }
        if (carry == 1){
            head.next = new ListNode(1);
        };
        return outPut.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        //System.out.println(l1.val);
        l1.next = new ListNode(9, new ListNode(1));

        ListNode l2 = new ListNode(1);
        Solution tester = new Solution();

        ListNode result = tester.addTwoNumbers(l1, l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
