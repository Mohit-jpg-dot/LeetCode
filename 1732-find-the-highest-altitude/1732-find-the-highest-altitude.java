class Solution {
    public int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int netGain = 0;
        for(int i = 0;i<gain.length;i++){
            netGain += gain[i];
            highestAltitude = Math.max(highestAltitude,netGain);
        }
        return highestAltitude;
    }
}