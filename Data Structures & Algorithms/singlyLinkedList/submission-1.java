class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    List[] values;
    ListNode head;
    ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        ListNode curr = this.head.next;
        int i = 0;

        while (curr != null) {
            if (i == index) {
                return curr.value;
            }
            i += 1;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        tail.next = new ListNode(val);
        tail = tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = head;

        while (i < index && curr != null) {
            i += 1;
            curr = curr.next;
        }

        if (curr != null && curr.next != null) {
            if (curr.next == tail) {
                tail = curr;
            }
            curr.next = (curr.next).next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ListNode curr = head.next;
        ArrayList result = new ArrayList();

        while (curr != null) {
            result.add(curr.value);
            curr = curr.next;
        }
        return result;
    }
}
