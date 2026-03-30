class TimeMap {
    HashMap<String,TreeMap<Integer,String>> hm = new HashMap<>();
    public TimeMap() {
        hm = new HashMap();        
    }
    
    public void set(String key, String value, int timestamp) {
        hm.putIfAbsent(key,new TreeMap());
        hm.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        
        if((!hm.containsKey(key)))
        {
            return "";
        }
        TreeMap<Integer, String> treeMap = hm.get(key);
        Integer floorKey = treeMap.floorKey(timestamp);
        
        if(floorKey==null)
        {
            return "";
        }

        return hm.get(key).get(floorKey);
    }
}
