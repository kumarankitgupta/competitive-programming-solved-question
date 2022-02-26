public class ReverseALinkedList {
    node head = null ; 
    class node{
        int data; 
        node next;

        node(int d){
            this.data = d ;
            this.next = null;
        }
    }
    // creation of a list 
    node addElemnt(int data){
        node n = new node(data);
        if(head == null){
            head = n ;
            return head;
        }
        node temp = head ;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
        return head;
    }
    void printList(node head){
        node temp;
        temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("X");

    }
    node reverseList(node head){
        node prev = null , curr = head, cnext = curr ;
        while(curr != null ){
            cnext = curr.next;
            curr.next = prev ;
            prev = curr ;
            curr = cnext;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseALinkedList ll = new ReverseALinkedList();
        node h = ll.addElemnt(12);
        h = ll.addElemnt(14);
        h = ll.addElemnt(16);
        h = ll.addElemnt(15);
        h = ll.addElemnt(20);
        ll.printList(h);
        h= ll.reverseList(h);
        ll.printList(h);

    }
}
