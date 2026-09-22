class Solution {

    public int totalMoney(int n) {

        int d = n / 7;
        int sum = 0;

        int div = n % 7;

        for(int j = 1; j <= d; j++) {

            for(int i = 1; i <= 7; i++) {
                sum += i + j - 1;
            }

        }

        d++;

        int c = 1;

        while(div != 0) {

            sum += c + d - 1;

            div--;
            c++;
        }

        return sum;
    }
}