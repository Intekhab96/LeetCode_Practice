class Solution {
    public int reverse(int x) {
        if (x == 0)
            return 0;

        long temp = x > 0 ? x : x * -1l;

        long ans = temp % 10;

        temp /= 10;

        while (temp > 0) {
            ans *= 10;
            ans += temp % 10;
            temp /= 10;
        }

        if (ans > Integer.MAX_VALUE)
            return 0;
        else
            return x < 0 ? (int) (ans * -1) : (int) ans;

    }
}