class Twitter {
    HashMap<Integer,HashSet<Integer>> follow;
    HashMap<Integer,List<Pair<Integer,Integer>>> post;
    int time;
    PriorityQueue<Pair<Integer,Integer>> pq;
    public Twitter() {
        follow = new HashMap();
        time =0;
         
        post = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        post.putIfAbsent(userId, new ArrayList());
        post.get(userId).add(new Pair<>(time,tweetId));
        time++;
    }
    
    public List<Integer> getNewsFeed(int userId) {
        pq = new PriorityQueue<>((a,b)->a.getKey()-b.getKey());
        LinkedList<Integer> ans =new LinkedList();
        List <Pair<Integer,Integer>> l;
        if(follow.containsKey(userId))
        {
            HashSet <Integer> hs = follow.get(userId);
            for(int f: hs)
            {
                l = post.get(f);
                for(int i=0;i<l.size();i++)
                {
                    pq.add(l.get(i));
                    if(pq.size()>10)
                    {
                        pq.poll();
                    }
                }
            }            
        }
        if(post.containsKey(userId))
        {        
            l = post.get(userId);
            for(int i=0;i<l.size();i++)
            {
                pq.add(l.get(i));
                if(pq.size()>10)
                {
                    pq.poll();
                }
            }
        }
        while(!pq.isEmpty())
        {
            ans.addFirst(pq.poll().getValue());
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        follow.putIfAbsent(followerId, new HashSet());
        follow.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        follow.get(followerId).remove(followeeId);
        if(follow.get(followerId).size()==0)
        {
            follow.remove(followerId);
        }
    }
}
