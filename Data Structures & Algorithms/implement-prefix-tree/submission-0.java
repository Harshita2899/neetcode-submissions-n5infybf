class PrefixTree {

    class Node 
    {
        Node [] char_chk = new Node[26];
        boolean eow;//end of word
    }
    Node root;
    public PrefixTree() {
        root= new Node();
        for(int i = 0;i<26;i++)
        {
            root.char_chk[i] = null;
        }
        root.eow = false;//end of word
         
    }

    public void insert(String word) {
        Node cur = root;
        for(int j = 0;j<word.length();j++)
        {
            for(int i =0;i<26;i++)
            {
                if(word.charAt(j)=='a'+i)
                {
                    if(cur.char_chk[i]==null)
                    {
                        cur.char_chk[i] = new Node();
                    }
                    cur = cur.char_chk[i];
                }

            }
        }
        cur.eow = true;
        

    }

    public boolean search(String word) {
        Node cur = root;
        for(int j = 0;j<word.length();j++)
        {
            for(int i =0;i<26;i++)
            {
                if(word.charAt(j)=='a'+i)
                {
                    if(cur.char_chk[i]==null)
                    {
                        return false;
                    }
                    cur = cur.char_chk[i];
                }

            }
        }     
        return cur.eow==true;
    }

    public boolean startsWith(String prefix) {
        Node cur = root;
        for(int j = 0;j<prefix.length();j++)
        {
            for(int i =0;i<26;i++)
            {
                if(prefix.charAt(j)=='a'+i)
                {
                    if(cur.char_chk[i]==null)
                    {
                        return false;
                    }
                    cur = cur.char_chk[i];
                }

            }
        } 
        return true;
    }
}
