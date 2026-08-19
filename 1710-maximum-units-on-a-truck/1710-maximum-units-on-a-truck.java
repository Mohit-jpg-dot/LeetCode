class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int units = 0,i = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        while(truckSize > 0 && boxTypes.length > i){
            if(truckSize >= boxTypes[i][0]){
                units += boxTypes[i][0]*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                units += truckSize * boxTypes[i][1];
                break;
            }
            i++;
        }
        return units;
    }
}