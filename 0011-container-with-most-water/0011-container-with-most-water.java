class Solution {
    public int maxArea(int[] height) {
    //     int rm = 0;
    //     for(int i = 0;i<height.length;i++){
    //         int max = 0;
    //         for(int  j = i;j<height.length;j++){
    //             int length = Math.min(height[i],height[j]);
    //             int breadth = j-i;
    //             max = Math.max(max,length*breadth);
    //         }
    //         rm = Math.max(max,rm);
    //     }
    //     return rm;
    // }

    int maxWater = 0;
    int left = 0;
    int right = height.length-1;
    while(left<right){
        int width = right - left;
        int heights = Math.min(height[left],height[right]);
        if(height[left] > height[right]){
            right--;
        }
        else{
            left++;
        }
        maxWater = Math.max(maxWater,width*heights);
    }
    return maxWater;
}
}