class Solution {
    public int searchrow(int[][] matrix, int target)
    {
        int low = 0;
        int high = matrix.length;
        int mid = (low+high)/2;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(matrix[mid][0]<= target && matrix[mid][matrix[mid].length-1]>= target )
            {
                return mid;
            }
            else if (matrix[mid][0]>= target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }
    int searchcol(int [] matrix,int target)
    {
        int low = 0;
        int high = matrix.length;
        int mid = (low+high)/2;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(matrix[mid]<= target && matrix[mid]>= target )
            {
                return mid;
            }
            else if (matrix[mid]>= target)
            {
                high = mid -1;
            }
            else
            {
                low =mid+1;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = searchrow(matrix, target);
        if(row<0)
        {
            return false;
        }
        int col = searchcol(matrix[row],target);
        
        if(col<0)
        {
            return false;
        }
        return true;
    }
}
