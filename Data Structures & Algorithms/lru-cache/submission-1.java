class LRUCache {

    TreeMap<Integer,Integer> tm;
    HashMap<Integer,Integer> hm;
    HashMap<Integer,Integer> im;
    int c,start,cur;
    public LRUCache(int capacity) {
        c= capacity;
        start = 0;
        hm =new HashMap<>();
        tm =new TreeMap<>();
        im =new HashMap<>();
    }
    
    public int get(int key) {
        if(hm.containsKey(key))
        {
            int oldIndex = im.get(key);
            tm.remove(oldIndex);
            tm.put(start, key);
            im.put(key, start);
            start++;
            return hm.get(key);
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(im.containsKey(key))
        {
            int ind = im.get(key);
            tm.remove(ind);
            tm.put(start,key);
            im.put(key,start);
            hm.put(key,value);
        }
        else
        {
            if(hm.size()==c)
            {
                int k = tm.get(tm.firstKey());
                im.remove(k);
                hm.remove(k);
                
            }
                tm.put(start,key);
                im.put(key,start);
                hm.put(key,value);
        }
        start++;

    }
}
