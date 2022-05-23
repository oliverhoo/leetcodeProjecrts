package com.hushuyu.leetcode70;

class Solution {
    public int climbStairs(int n) {
        if (n < 1) {
            return 0;
        }
        int[] dup = new int[n + 1];
        dup[0] = 1;
        dup[1] = 1;
        for (int i = 2; i <= n; i++) {
            dup[i] = dup[i - 1] + dup[i - 2];
        }
        return dup[n];
    }
}