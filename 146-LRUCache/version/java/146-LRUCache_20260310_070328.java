// Last updated: 3/10/2026, 7:03:28 AM
1class LRUCache {
2    private class Node {
3        int key;
4        int value;
5        Node prev;
6        Node next;
7        
8        Node(int key, int value) {
9            this.key = key;
10            this.value = value;
11        }
12    }
13    
14    private int capacity;
15    private Map<Integer, Node> map;
16    private Node head; // Most recently used
17    private Node tail; // Least recently used
18    
19    public LRUCache(int capacity) {
20        this.capacity = capacity;
21        this.map = new HashMap<>();
22        
23        // Initialize dummy head and tail nodes to avoid null checks
24        head = new Node(-1, -1);
25        tail = new Node(-1, -1);
26        head.next = tail;
27        tail.prev = head;
28    }
29    
30    public int get(int key) {
31        if (!map.containsKey(key)) {
32            return -1;
33        }
34        
35        Node node = map.get(key);
36        // Move the accessed node to the front (most recently used)
37        moveToHead(node);
38        return node.value;
39    }
40    
41    public void put(int key, int value) {
42        if (map.containsKey(key)) {
43            // Update existing node
44            Node node = map.get(key);
45            node.value = value;
46            moveToHead(node);
47        } else {
48            // Create new node
49            Node newNode = new Node(key, value);
50            
51            // If at capacity, remove the least recently used node
52            if (map.size() == capacity) {
53                Node lru = tail.prev;
54                removeNode(lru);
55                map.remove(lru.key);
56            }
57            
58            // Add new node to the front
59            addToHead(newNode);
60            map.put(key, newNode);
61        }
62    }
63    
64    private void moveToHead(Node node) {
65        removeNode(node);
66        addToHead(node);
67    }
68    
69    private void addToHead(Node node) {
70        // Add node right after head
71        node.next = head.next;
72        node.prev = head;
73        head.next.prev = node;
74        head.next = node;
75    }
76    
77    private void removeNode(Node node) {
78        // Remove node from its current position
79        node.prev.next = node.next;
80        node.next.prev = node.prev;
81    }
82}
83
84/**
85 * Your LRUCache object will be instantiated and called as such:
86 * LRUCache obj = new LRUCache(capacity);
87 * int param_1 = obj.get(key);
88 * obj.put(key,value);
89 */