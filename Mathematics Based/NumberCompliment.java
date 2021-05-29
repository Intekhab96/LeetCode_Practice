class Solution {
    public int findComplement(int num) {
        if (num == 1)
            return 0;

        int result = 0;
        int power = 1;
        while (num > 0) {
            if ((num % 2 ^ 1) == 1) {
                result += power;
            }
            power <<= 1;
            num >>= 1;
        }

        return result;
    }
}