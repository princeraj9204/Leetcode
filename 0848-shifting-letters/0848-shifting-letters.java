class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();

        long[] prefix = new long[n];

        prefix[n - 1] = shifts[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            prefix[i] = shifts[i] + prefix[i + 1];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            int shift = (int)(prefix[i] % 26);

            char ch = (char)((c - 'a' + shift) % 26 + 'a');

            sb.append(ch);
        }

        return sb.toString();
    }
}