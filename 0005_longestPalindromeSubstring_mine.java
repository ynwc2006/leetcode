class Solution {
   public static String longestPalindrome(String s) {

        if (s.length() == 0) return "";

        int[] dp = new int[2000];
        int len = 1;
        int lenLast = 1;
        int maxCenter = 0;
        java.util.Arrays.fill(dp, 1);

        for (int i = 1; i < s.length(); i++) {
            for (int j = 1; j <= 2 * s.length() - 2; j++) {
                if (dp[j] > 0 && check(s, i, j)) {
                    dp[j] = i * 2 + (j + 1) % 2;
                    if (dp[j] > len) {
                        len = dp[j];
                        maxCenter = j;
                    }

                } else dp[j] = 0;

            }
            lenLast = len;
            //if (len<i) break;
        }
        if (maxCenter % 2 == 0)
            return s.substring(maxCenter / 2 - len / 2, maxCenter / 2 + len / 2 + 1);
        else
            return s.substring(maxCenter / 2 - (len - 1) / 2, maxCenter / 2 + len / 2 + 1);


    }


    private static boolean check(String s, int i, int j) {
        switch (j % 2) {
            case 0:
                if (((j / 2 - i) < 0) || (j / 2 + i) > s.length() - 1) return false;
                if (s.charAt(j / 2 - i) != s.charAt(j / 2 + i)) return false;
                return true;
            case 1:
                if (((j / 2 - i + 1) < 0) || (j / 2 + i) > s.length() - 1) return false;
                if (s.charAt(j / 2 - i + 1) != s.charAt(j / 2 + i)) return false;
                return true;

        }
        return true;
    } 
    
}
