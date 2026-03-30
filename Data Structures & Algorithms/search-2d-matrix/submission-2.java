class Solution {
    public boolean bsearch(int[] arr, int low, int high, int target)
    {
        int mid ;
        while(low<=high)
        {
            mid= (low+high)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(arr[mid]>target)
            {
                low = mid+1;
            }
            else
            {
                high = mid -1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row;
        for (int i=0;i<matrix.length;i++)
        {
            if((target>=matrix[i][0])&&(target<=matrix[i][matrix[i].length-1]))
            {
                return bsearch(matrix[i],0,matrix[i].length-1,target);
            }
        }
        return false;
    }
}
