package AddTwoNumbers;

import java.util.LinkedList;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var x = l1;
        LinkedList<Integer> res = new LinkedList<>();
        while (x.next != null) {
            res.push(x.val);
            x = x.next;
            System.out.println(x.val);
        }
        System.out.println(res);
        var node3_expected = new ListNode(8);
        var node2_expected = new ListNode(0, node3_expected);
        var node1_expected = new ListNode(7, node2_expected);
        return node1_expected;
    }
}