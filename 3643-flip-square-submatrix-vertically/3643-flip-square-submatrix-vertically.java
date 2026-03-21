class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) 
    {
        int low = x;
        int high = x+k-1;
        int temp = 0;

        while(low < high)
        {
            for(int i = y; i < (y+k); i++)
            {
                temp = grid[low][i];
                grid[low][i] = grid[high][i];
                grid[high][i] = temp;
            }
            low++;
            high--;
        }
        return grid;
    }
}