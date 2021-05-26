class Solution {
    public int[] sortArrayByParity(int[] A) {
        if (A.length == 1)
            return A;
        int temp;
        for (int i = 0, j = A.length - 1; i <= j;) {
            if (A[i] % 2 == 0) {
                i++;
                continue;
            } else {
                if (A[j] % 2 == 0) {
                    // swap
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
                j--;
            }
        }

        return A;
    }
}