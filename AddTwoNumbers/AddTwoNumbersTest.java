package AddTwoNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    @Test
    void  case1(){
        var node3_l1 = new ListNode(3);
        var node2_l1 = new ListNode(4, node3_l1);
        var node1_l1 = new ListNode(2, node2_l1);

        var node3_l2 = new ListNode(4);
        var node2_l2 = new ListNode(6, node3_l2);
        var node1_l2 = new ListNode(5, node2_l2);

        var node3_expected = new ListNode(8);
        var node2_expected = new ListNode(0, node3_expected);
        var node1_expected = new ListNode(7, node2_expected);

        var addTwoNumbers = new AddTwoNumbers();

        assertEquals(node1_expected, addTwoNumbers.addTwoNumbers(node1_l1, node1_l2));

    }
}