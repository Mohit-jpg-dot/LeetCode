class Solution {
    public boolean lemonadeChange(int[] bills) {
        int dollarCount5 = 0,i = 0;
        int dollarCount10 = 0;
        while(i < bills.length){
            if(bills[i] == 5){
                dollarCount5++;
            }
            else if(bills[i] == 10){
                if(dollarCount5 > 0){
                    dollarCount10++;
                    dollarCount5--;
                }
                else{
                    return false;
                } 
            }
            else{
                int total = (dollarCount5 * 5) + (dollarCount10 * 10);
                if(dollarCount10 > 0 && dollarCount5 > 0){
                    dollarCount10--;
                    dollarCount5--;
                }
                else if(dollarCount5 >= 3){
                    dollarCount5 -= 3;
                }
                else{
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}