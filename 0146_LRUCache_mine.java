class LRUCache {
    private int cap;
    private int size;
    private Map<Integer,Integer> map;
    private LinkedList<Integer> list;

    public LRUCache(int capacity) {
        size=capacity;
        map=new HashMap<>();
        list=new LinkedList<>();
        cap=capacity;
        size=0;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        list.remove(Integer.valueOf(key));
        list.add(key);      
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.put(key,value);
            list.remove(Integer.valueOf(key));
            list.add(key);
            return;
        }
        size++;
        if(size>cap){
            int t =list.remove();
            size--;
            map.remove(t);
        }
        map.put(key,value);
        
        list.add(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
