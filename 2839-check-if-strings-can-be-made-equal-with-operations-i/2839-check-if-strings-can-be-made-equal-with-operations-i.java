class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] arr = s1.toCharArray();
        if(arr[0] != s2.charAt(0)){
            char temp = arr[0];
            arr[0] = arr[2];
            arr[2] = temp;
        }
        if(arr[1] != s2.charAt(1)){
            char temp = arr[1];
            arr[1] = arr[3];
            arr[3] = temp;
        }
        return new String(arr).equals(s2);
    }
}