class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] par = new int[edges.length+1];
        int[] rank = new int[edges.length+1];
        for(int i=0;i<=edges.length;i++)
        {
            par[i]=i;
            rank[i]=1;
        }
        for(int i=0;i<edges.length;i++)
        {
            if(!union(par,rank,edges[i][0],edges[i][1]))
            {
                return new int[]{edges[i][0],edges[i][1]};
            }
        }
        return  new int[0];
    }
    int find(int[] par, int n)
    {
        if(par[n]!=n)
        {
            par[n] =find(par,par[n]);
        }
        
        return par[n];
    }

    boolean union(int[] par,int[] rank,int a,int b)
    {
        int pa = find(par,a);
        int pb = find(par, b);
        if(pa==pb)
        {
            return false;
        }
        else if(rank[pa]<rank[pb])
        {
            par[pb]=pa;
            rank[pa] = rank[pa]+rank[pb];
        }
        else 
        {
            par[pa]=pb;
            rank[pb] = rank[pa]+rank[pb];
        }
        return true;
    }

}
