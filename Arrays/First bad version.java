
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1 && isBadVersion(n))
            return n;
        int left = 1;
        int right = n;
        int mid = 0;
        while (left <= right) {
            // System.out.println(left);
            // System.out.println(right);
            mid = left + (right - left) / 2;
            // System.out.println(mid);
            if (isBadVersion(mid))
                right = mid - 1;
            else {
                left = mid + 1;
            }
        }

        return left;

    }
}