package Stairs_problem;

class Solution {
    public int climbStairs(int n) {
        int[] cache = new int[n+1];
        if (n == 1){
            return 1;
        }
        if (n ==2){
            return 2;
        }
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 2;
        for (int x = 3; x<=n; x++){
            cache[x] = cache[x-1] + cache[x-2];
        }


        return cache[n];
    }
}