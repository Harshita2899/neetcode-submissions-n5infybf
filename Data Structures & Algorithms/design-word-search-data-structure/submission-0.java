class WordDictionary {
    class Node 
    {
        Node[] chk = new Node[26];
        boolean eow;
    }
    Node root;
    public WordDictionary() {
        root = new Node();
        for(int i=0;i<26;i++)
        {
            root.chk[i]= null;
        }
        root.eow = false;
    }

    public void addWord(String word) {
        Node cur = root;
        for(int i=0;i<word.length();i++)
        {
            int idx = word.charAt(i) - 'a';
            
            if(cur.chk[idx]==null)
            {
                cur.chk[idx]= new Node();
            }
            cur = cur.chk[idx];
                
            
        }
        cur.eow =true;
        
    }

    boolean s(String word, int i, Node r)
    {
        
        Node cur = r;
        for(int j=i;j<word.length();j++)
        {
            if(word.charAt(j)=='.')
            {
                for(int k=0;k<26;k++)
                {
                    if((cur.chk[k]!= null) && (s(word,j+1,cur.chk[k])))
                    {
                        return true;
                    }
                }
                return false;
            }
            else
            {
                if(cur.chk[word.charAt(j)-'a']==null)
                {
                    return false;
                }
                cur = cur.chk[word.charAt(j)-'a'];
            }
        }
        return cur.eow;

    }

    public boolean search(String word) {
        Node cur = root;
        return s(word,0,cur);
        
    }
}
