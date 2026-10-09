
class Solution {
    public boolean canChange(String start, String target) {
        int i = 0;
        int j = 0;
        int n = start.length();

        while (i < n || j < n) {

            while (i < n && start.charAt(i) == '_') {
                i++;
            }

            while (j < n && target.charAt(j) == '_') {
                j++;
            }

            if (i == n || j == n) {
                return i == n && j == n;
            }

            char a = start.charAt(i);
            char b = target.charAt(j);

            if (a != b) {
                return false;
            }

            if (a == 'L' && i < j) {
                return false;
            }

            if (a == 'R' && i > j) {
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}
