// Input: n = 1
// Output: true


class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        else if(n == 1) return true;
        return (n & n-1) == 0;
    }
}
