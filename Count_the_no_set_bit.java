//Count the number of set bits


// Input: n = 6
// Output: 2 
  
class Solution {
    static int setBits(int n) {
        int cnt = 0;
        while(n > 1){
            if(n % 2 == 1){
                cnt += 1;
            }
            n = n/2;
        }
        if(n == 1){
            cnt++;
        }
        return cnt;
    }
}
