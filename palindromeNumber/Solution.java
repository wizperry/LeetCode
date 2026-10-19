package palindromeNumber;

    class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0){
            return false;
        }
        
        int temp = x;
        int count = 1;
        while(temp >=10){
            temp = temp/10;
            count = count * 10;
        }

        while(count > 1){
            int i = x / count;
            int j = x%10;
            
            if(i != j){
                return false;
            }

            x = (x % count) / 10;
            count = count / 100;
        }
        return true;

    }
}

