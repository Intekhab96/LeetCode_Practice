class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sumFormula;
        int n = nums.length;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        // if(n % 2 == 0){
        // sumFormula = n/2;
        // sumFormula *= (n+1);
        // }else{
        // sumFormula = (n+1)%2;
        // sumFormula *= n;
        // }

        sumFormula = (n * (n + 1)) / 2;

        return sumFormula - sum;

    }
}