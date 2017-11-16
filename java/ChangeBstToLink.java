public class ChangeBstToLink {

    private Node head, tail;
    private static class Node {
        private int value;
        private Node leftNode;
        private Node rightNode;

        public Node(int value, Node leftNode, Node righNode) {
            this.value = value;
            this.leftNode = leftNode;
            this.rightNode = righNode;
        }
    }

    private void changeNode(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.leftNode = tail;
            tail.rightNode = node;
            tail = node;
        }
    
    }
    public void traversal(Node node){  
        if(node==null) return;  
        if(node.leftNode!=null) traversal(node.leftNode);  
        changeNode(node);  
        if(node.rightNode!=null) traversal(node.rightNode);  
    } 
    
    //头结点向后打印  
    private void printHead() {  
        while(head!=null){  
            System.out.print(head.value+" ");  
            head = head.rightNode;  
        }  
    }  
      
    //尾节点向前打印  
    private void printTail(){  
        while(tail!=null){  
            System.out.print(tail.value+" ");  
            tail = tail.leftNode;  
        }  
    }  
  
    public static void main(String[] args) {  
        Node node1 = new Node(4,null,null);  
        Node node2 = new Node(8,null,null);  
        Node node3 = new Node(12,null,null);  
        Node node4 = new Node(16,null,null);  
        Node node5 = new Node(6,node1,node2);  
        Node node6 = new Node(14,node3,node4);  
        Node node7 = new Node(10,node5,node6);  
        ChangeBstToLink t = new ChangeBstToLink();  
        t.traversal(node7);  
        System.out.println("双向链表从头结点向后遍历:");  
        t.printHead();  
        System.out.println("\n双向链表从尾结点向前遍历:");  
        t.printTail();  
    } 
}