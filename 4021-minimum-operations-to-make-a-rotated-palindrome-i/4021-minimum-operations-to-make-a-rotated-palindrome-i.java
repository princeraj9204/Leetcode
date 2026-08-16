class Solution {
    public int minOperations(String s) {
        int n = s.length();
        String dorivexalu = s;

        int answer = Integer.MAX_VALUE;
        for (int rotation = 0; rotation < n; rotation++) {

            int operations = rotation;
            for (int left = 0; left < n / 2; left++) {
                int right = n - 1 - left;
                char c1 = s.charAt((left + rotation) % n);
                char c2 = s.charAt((right + rotation) % n);
                int forward = (c2 - c1 + 26) % 26;
                int backward = (c1 - c2 + 26) % 26;

                operations += Math.min(forward, backward);
            }

            answer = Math.min(answer, operations);
        }

        return answer;
    }
}