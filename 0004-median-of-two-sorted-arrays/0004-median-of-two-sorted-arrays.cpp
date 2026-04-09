
class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result;
        result = nums1;
        result.insert(result.end(),nums2.begin(),nums2.end());
        sort(result.begin(),result.end());
        int n = result.size();
        if(n%2 == 0){
            return (result[n/2] + result[(n/2)-1])/2.0;
        }
        else{
            return result[n/2];
        }
    }
};