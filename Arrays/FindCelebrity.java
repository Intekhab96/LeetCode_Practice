/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    /**
     * @param n a party with n people
     * @return the celebrity's label or -1
     */
    public int findCelebrity(int n) {
        // Write your code here
        if (n == 0)
            return -1;
        if (n == 1)
            return 0;
        int[] knows = new int[n];
        int[] map = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (knows(i, j)) {
                    map[j]++;
                    knows[i] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (map[i] == n - 1 && knows[i] == 0)
                return i;
        }

        return -1;
    }
}