class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        while(left<right){
            if(height[left]<height[right]){
                sum=height[left]*(right-left);
                maxsum=  Math.max(sum,maxsum);
                left++;
            }else{
                sum=height[right]*(right-left);
                maxsum=  Math.max(sum,maxsum);
                right--;
            }
        }
        return maxsum;
    }
}