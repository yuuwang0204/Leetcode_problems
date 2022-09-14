public class AddTwoNumsSol {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry !=0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;

            pre.next = new ListNode(sum % 10);
            carry = sum / 10;
            pre = pre.next;

            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;


        }
        return dummy.next;

    }
}
