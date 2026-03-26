class Solution {
    public boolean solveForSingleRow(int[][] grid){
        int rows = grid.length, cols = grid[0].length;
        long totalSum = 0;
        for(int x : grid[0]) totalSum += x;

        long sum = 0;
        for(int j = 0; j < cols-1; j++){
            sum += grid[0][j];

            if((totalSum & 1) == 0 && sum == totalSum >> 1) return true;
            if(sum > totalSum >> 1 && j == 0) continue;
            if(sum <= totalSum >> 1 && j == cols-2) continue;

            long diff = Math.abs(totalSum - (sum << 1));
            if(sum > totalSum >> 1 && (grid[0][0] == diff || grid[0][j] == diff))
                return true;
            
            if(sum <= totalSum >> 1 && (grid[0][cols-1] == diff || grid[0][j] == diff))
                return true;
        }
        return false;
    }

    public boolean solveForSingleCol(int[][] grid){
        int rows = grid.length, cols = grid[0].length;

        long totalSum = 0;
        for(int i = 0; i < rows; i++) totalSum += grid[i][0];

        long sum = 0;
        for(int i = 0; i < rows-1; i++){
            sum += grid[i][0];

            if((totalSum & 1) == 0 && sum == totalSum >> 1) return true;
            if(sum > totalSum >> 1 && i == 0) continue;
            if(sum <= totalSum >> 1 && i == rows-2) continue;

            long diff = Math.abs(totalSum - (sum << 1));
            if(sum > totalSum >> 1 && (grid[i][0] == diff || grid[0][0] == diff))
                return true;
            
            if(sum <= totalSum >> 1 && (grid[i][0] == diff || grid[rows-1][0] == diff))
                return true;
        }
        return false;
    }

    public boolean canPartitionGrid(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;

        if(rows == 1){
            return solveForSingleRow(grid);
        }
        if(cols == 1){
            return solveForSingleCol(grid);
        }

        Map<Integer,Integer> freqMap1 = new HashMap<>();
        Map<Integer,Integer> freqMap2 = new HashMap<>();

        long totalSum = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                totalSum += grid[i][j];
                freqMap2.put(grid[i][j], freqMap2.getOrDefault(grid[i][j], 0) + 1);
            }
        }

        long sum = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                sum += grid[i][j];
                freqMap2.put(grid[i][j], freqMap2.get(grid[i][j])-1);
                freqMap1.put(grid[i][j], freqMap1.getOrDefault(grid[i][j], 0) + 1);
            }   
            if(i == rows-1) break;
            if((totalSum & 1) == 0 && sum == totalSum >> 1) return true;
        
            if(sum > totalSum >> 1){
                long diff = (sum << 1) - totalSum;
                if(diff > 100000L) continue; 
                if(freqMap1.containsKey((int)diff)){
                    if(freqMap1.get((int)diff) > 0){
                        if(i == 0 && !(grid[0][0] == diff || grid[0][cols-1] == diff));
                        else return true;
                    }
                }
            }

            if(sum <= totalSum >> 1){
                long diff = totalSum - (sum << 1);
                if(diff > 100000L) continue; 
                if(freqMap2.containsKey((int)diff)){
                    if(freqMap2.get((int)diff) > 0){
                        if(i == rows-2 && !(grid[rows-1][0] == diff || grid[rows-1][cols-1] == diff));
                        else return true;
                    }
                }
            }
        }

        sum = 0;
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                sum += grid[i][j];
                freqMap1.put(grid[i][j], freqMap1.get(grid[i][j])-1);
                freqMap2.put(grid[i][j], freqMap2.getOrDefault(grid[i][j], 0) + 1);
            }
            if(j == cols-1) break;
            if((totalSum & 1) == 0 && sum == totalSum >> 1) return true;
            
            if(sum > totalSum >> 1){
                long diff = (sum << 1) - totalSum;
                if(diff > 100000L) continue; 
                if(freqMap2.containsKey((int)diff)){
                    if(freqMap2.get((int)diff) > 0){
                        if(j == 0 && !(grid[0][0] == diff || grid[rows-1][0] == diff));
                        else return true;
                    }
                }
            }

            if(sum <= totalSum >> 1){
                long diff = totalSum - (sum << 1);
                if(diff > 100000L) continue;
                if(freqMap1.containsKey((int)diff)){
                    if(freqMap1.get((int)diff) > 0){
                        if(j == cols-2 && !(grid[0][cols-1] == diff || grid[rows-1][cols-1] == diff));
                        else return true;
                    }
                }
            }
        }
        return false;
    }
}