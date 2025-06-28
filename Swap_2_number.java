//Input: a = 13, b = 9
//Output: 9 13


class Solution {
    static List<Integer> get(int a, int b) {
        a = a^ b;
        b = a^ b;
        a = a^b;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        return arr;
    }
}
