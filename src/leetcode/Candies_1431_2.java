package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Candies_1431_2 {
    public static void main(String[] args) {
        int[] x = new int[]{2, 3, 5, 3,1};
        Solution y = new Solution();
        List<Boolean> answer = y.kidsWithCandies(x, 3);
        System.out.println(answer);
    }
}

class Solution2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }


        for (int i = 0; i < candies.length; i++) {
            int j = candies[i] + extraCandies;
            if (j >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
