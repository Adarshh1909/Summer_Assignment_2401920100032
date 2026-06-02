class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<=k-1;i++){
            sum+=nums[i];
        }
        int Maximumsum=sum;
        int first=0;
        for(int i=k;i<nums.length;i++){
            sum-=nums[first];
            first++;
            sum+=nums[i];
            Maximumsum=Math.max(Maximumsum,sum);
        }
        return (double)Maximumsum/k;
    }
}