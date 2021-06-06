class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int minSwaps = Math.min(numMinSwaps(A[0], A, B), numMinSwaps(B[0], A, B));
        minSwaps = Math.min(minSwaps, numMinSwaps(A[0], B, A));
        minSwaps = Math.min(minSwaps, numMinSwaps(B[0], B, A));

        return minSwaps == Integer.MAX_VALUE ? -1 : minSwaps;
    }

    private int numMinSwaps(int target, int[] A, int[] B) {
        int numSwaps = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != target && B[i] != target)
                return Integer.MAX_VALUE;
            else if (A[i] != target)
                numSwaps++;
        }

        return numSwaps;
    }
}