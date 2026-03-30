class LRUCache {
    int cap;
    LinkedHashMap<Integer,Integer> hm;
    public LRUCache(int capacity) {
        cap = capacity;
        hm = new LinkedHashMap(cap,0.75f,true);
    }
    
    public int get(int key) {
        return hm.getOrDefault(key,-1);
        
    }
    
    public void put(int key, int value) {
        
        if(cap==hm.size())
        {
        
            int k= hm.entrySet().iterator().next().getKey();
            hm.remove(k);
        }
        hm.put(key,value);
    }
}
