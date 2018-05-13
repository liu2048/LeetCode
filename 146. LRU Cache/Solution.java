class LRUCache {
    private Map<Integer, Node> map;
    private DoublyLinkedList dll;
    private final int CAPACITY;    
    
    public LRUCache(int capacity) {
        this.CAPACITY = capacity;
        this.map = new HashMap<>(capacity);
        this.dll = new DoublyLinkedList();
    }    
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;        
        dll.update(node);
        return node.val;        
    }    
    public void put(int key, int value) {        
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            dll.update(node);
        } else {
            if (map.size() == CAPACITY) {
                Node removedNode = dll.removeLast();
                map.remove(removedNode.key);
            }
            Node node = new Node(key, value);
            dll.addFirst(node);
            map.put(key, node);                        
        }  
    }
}

class DoublyLinkedList {
    private Node head, tail;
    public DoublyLinkedList() {
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    public void addFirst(Node node) {
        node.next = head.next;  
        head.next.prev = node;
        node.prev = head;        
        head.next = node;
    }
    public Node remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        node.prev = null;
        node.next = null;
        return node;
    }
    public Node removeLast() {
        return remove(tail.prev);
    }
    public void update(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        addFirst(node);
    }
}

class Node {
    int key, val;
    Node prev, next;
    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
