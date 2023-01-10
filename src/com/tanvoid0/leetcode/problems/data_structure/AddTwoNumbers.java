class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, 
            new ListNode(0, 
                new ListNode(0, 
                    new ListNode(0, 
                        new ListNode(0, 
                            new ListNode(0, 
                                new ListNode(0, 
                                    new ListNode(0, 
                                        new ListNode(0, 
                                            new ListNode(0, 
                                                new ListNode(0, 
                                                    new ListNode(0, 
                                                        new ListNode(0, 
                                                            new ListNode(0, 
                                                                new ListNode(0, 
                                                                    new ListNode(0, 
                                                                        new ListNode(0, 
                                                                            new ListNode(0, 
                                                                                new ListNode(0, 
                                                                                    new ListNode(0, 
                                                                                        new ListNode(0, 
                                                                                            new ListNode(0, 
                                                                                                new ListNode(0, 
                                                                                                    new ListNode(0, 
                                                                                                        new ListNode(0, 
                                                                                                            new ListNode(0, 
                                                                                                                new ListNode(0, 
                                                                                                                    new ListNode(0, 
                                                                                                                        new ListNode(0, 
                                                                                                                            new ListNode(0, 
                                                                                                                                new ListNode(1)
                                                                                                                            )
                                                                                                                        )
                                                                                                                    )
                                                                                                                )
                                                                                                            )
                                                                                                        )
                                                                                                    )
                                                                                                )
                                                                                            )
                                                                                        
                                                                                        )
                                                                                    )
                                                                                )
                                                                            )
                                                                        )
                                                                    )
                                                                )
                                                            )
                                                        )
                                                    )
                                                )
                                            )
                                        )
                                    )
                                )
                            )
                        )
                    )
                )
            )
        );
        
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode total = Solution.addTwoNumbers(l1, l2);

        while (total != null) {
            System.out.println("Two numbers: "+total.val);
            total = total.next;
        }
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i =0;
        ListNode pointer = null;
        int car = 0;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + car;
            final ListNode node = new ListNode(val % 10);
            car = val > 9 ? 1 : 0;

            pointer = node;
            pointer = pointer.next;
            l1 = l1.next;
            l2 = l2.next;
            System.out.println("Cal: " + (i++) + " l1: "+ l1.val + " l2: " + l2.val + " val: " + val + " car: " + car);
        }

        while (l1 != null) {
            int val = l1.val + car;
            final ListNode node = new ListNode (val %10);
            car = val > 9 ? 1 : 0;

            pointer = node;
            pointer = pointer.next;
            l1 = l1.next;
            System.out.println("Cal: " + (i++) + " l1: "+ l1.val + " l2: " + l2.val + " val: " + val + " car: " + car);
        }

        while (l2 != null) {
            int val = l2.val + car;
            final ListNode node = new ListNode(val%10);
            car = val > 9 ? 1 : 0;

            pointer = node;
            pointer = pointer.next;
            l2 = l2.next;
            System.out.println("Cal: " + (i++) + " l1: "+ l1.val + " l2: " + l2.val + " val: " + val + " car: " + car);
        }

        return pointer;
    }
}