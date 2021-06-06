package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Candies_1431 {
    public static void main(String[] args) {
        int[] x = new int[]{2, 3, 5, 1, 3};
        Solution y = new Solution();
        List<Boolean> answer = y.kidsWithCandies(x, 3);
        System.out.println(answer);
    }
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int x = candies[i] + extraCandies;
            int max = 0;
            for (int j = 0; j < candies.length; j++) {
                if (candies[j] > max) {
                    max = candies[j];
                }
                //System.out.println("Max: " + max);
            }
            if (x >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
            //System.out.println(x);
        }
        return list;
    }
}