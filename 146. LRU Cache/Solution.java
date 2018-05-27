class LRUCache {
    private final int CAPACITY;    
    private Map<Integer, Node> map;
    private DoublyLinkedList dll;
    public LRUCache(int capacity) {
        this.CAPACITY = capacity;
        this.map = new HashMap<>();
        this.dll = new DoublyLinkedList(); 
    }
    
    public int get(int key) {        
        Node node = map.get(key);
        if (node == null) return -1;
        dll.update(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            dll.update(node);            
        } else {
            Node node = new Node(key, value);
            map.put(key, node);
            dll.addFirst(node);            
            if (map.size() > CAPACITY) {
                int lastKey = dll.removeLast();
                map.remove(lastKey);                
            }     
            
        }
    }
}

class DoublyLinkedList{
    Node head, tail;
    public DoublyLinkedList() {
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    public void update(Node node) {
        remove(node);
        addFirst(node);
    }
    public void remove(Node node) {
        Node pre = node.prev;
        Node nxt = node.next;
        node.prev = null;
        node.next = null;
        pre.next = nxt;
        nxt.prev = pre;
    }
    public void addFirst(Node node) {
        Node second = head.next;
        head.next = node;
        node.prev = head;
        node.next = second;
        second.prev = node;
    }    
    public int removeLast() {
        Node last = tail.prev;
        tail.prev = last.prev;
        last.prev.next = tail;
        last.prev = null;
        last.next = null;
        return last.key;
    }
}

class Node {
    Node prev, next;
    int key, value;
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
