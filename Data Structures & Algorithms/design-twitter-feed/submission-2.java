class Twitter {
    HashMap<Integer,HashSet<Integer>> follow;
    HashMap<Integer,List<Pair<Integer,Integer>>> post;
    int time;
    
    public Twitter() {
        follow = new HashMap();
        time =0;
         
        post = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        post.putIfAbsent(userId, new ArrayList<>());
        post.get(userId).add(new Pair<>(time,tweetId));
        time++;
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getKey()-b.getKey());
        LinkedList<Integer> ans =new LinkedList<>();
        List <Pair<Integer,Integer>> h= new ArrayList();
        if(post.containsKey(userId))
        {        
            h.addAll(post.get(userId));
        }
        if(follow.containsKey(userId))
        {
            HashSet <Integer> hs = follow.get(userId);
            for(int f: hs)
            {
                if(post.containsKey(f))
                {
                    h.addAll(post.get(f));
                    
                }
                }
            }    
            for(Pair<Integer,Integer> l: h)
            {
                pq.add(l);
                if(pq.size()>10)
                {
                    pq.poll();
                }        
            }
        
        while(!pq.isEmpty())
        {
            ans.addFirst(pq.poll().getValue());
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        follow.putIfAbsent(followerId, new HashSet());
        follow.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        if(follow.containsKey(followerId))
        follow.get(followerId).remove(followeeId);
        if(follow.get(followerId).isEmpty())
        {
            follow.remove(followerId);
        }
    }
}
