class Solution {
    public String capitalizeTitle(String title) {
        String str = title.toLowerCase();
        String[] words = str.trim().split("\\s+");
        for(int i = 0;i<words.length;i++){
            if(words[i].length() > 2){
                words[i] = Character.toUpperCase(words[i].charAt(0))+words[i].substring(1);
            }
        }
        return String.join(" ",words);
    }
}