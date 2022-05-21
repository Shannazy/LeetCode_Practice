package Merge_List;

public class Runner {



    public static void main(String[] args) {
        Solution.ListNode t1_3 = new Solution.ListNode(4);
        Solution.ListNode t1_2 = new Solution.ListNode(2, t1_3);
        Solution.ListNode list1 = new Solution.ListNode(1, t1_2);

        /*
        Solution.ListNode t2_6 = new Solution.ListNode(18);
        Solution.ListNode t2_5 = new Solution.ListNode(17, t2_6);
        Solution.ListNode t2_4 = new Solution.ListNode(16, t2_5);
        */
        Solution.ListNode t2_3 = new Solution.ListNode(5);
        Solution.ListNode t2_2 = new Solution.ListNode(3, t2_3);
        Solution.ListNode list2 = new Solution.ListNode(1, t2_2);

        Solution.ListNode endResult = new Solution.ListNode();
        Solution tester = new Solution();
        endResult = tester.mergeTwoLists(list1, list2);
        while(endResult != null){
            System.out.println(endResult.val);
            endResult = endResult.next;
        }
    }


}
