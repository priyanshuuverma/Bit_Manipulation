// Input:
// n = 17 , l = 2 , r = 3
// Output:
// 23



class Solution {
    static int toggleBits(int n, int l, int r) {
        // code here
        
        for(int i = l; i<= r; i++){
            int mask = 1<<i-1;
            n = n ^ mask;
        }
        return n;
        
    }
};
