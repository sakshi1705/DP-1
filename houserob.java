# Time Complexity : O(n)
# Space Complexity : O(1)




class Solution {
    public int rob(int[] nums) {
        
    int prevMax = 0;
    int currMax = 0;
    for (int x : nums) {
        int temp = currMax;
        currMax = Math.max(prevMax + x, currMax);
        prevMax = temp;
    }
    return currMax;
    }
}