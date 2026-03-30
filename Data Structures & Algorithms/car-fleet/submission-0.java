class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<int[]> a = new ArrayList();
        int [] in = new int [2];
        for(int i =0;i<position.length;i++)
        {
            
            a.add(new int[]{position[i], speed[i]});
            
        }
        Collections.sort(a,(a1, b1) -> b1[0]-a1[0]);
        int count=1; 
        double temp;
        double t =(double)(target - a.get(0)[0])/a.get(0)[1];
        //System.out.println(a.size());
        for(int i=1;i<a.size();i++)
        {
            //System.out.println(a.get(i)[0]+" "+a.get(i)[1]);
            temp = (double)(target - a.get(i)[0])/a.get(i)[1];
            if (t>=temp)
            {
                continue;
            }
            else
            {
                t= temp;
                count++;
            }
        }
        return count;
    }
}
