class Solution {
    public int hammingDistance(int x, int y) {

        int result = 0;
        while (x > 0 && y > 0) {
            if ((x % 2 ^ y % 2) == 1)
                result++;
            x >>= 1;
            y >>= 1;
        }

        if (x != 0) {
            while (x > 0) {
                if (x % 2 == 1)
                    result++;
                x >>= 1;
            }
        } else if (y != 0) {
            while (y > 0) {
                if (y % 2 == 1)
                    result++;
                y >>= 1;
            }
        }

        return result;

    }
}