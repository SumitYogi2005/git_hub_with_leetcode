class Solution {
    public int b_serch(int l,int r,int t ,int[] nums){
        if(l>r){
            return l;
        }
        int mid = l+(r-l)/2;
        if(nums[mid]==t){
            return mid;
        }
        if(nums[mid]>t){
           return  b_serch(l,mid-1,t,nums);
        }else{
          return b_serch(mid+1,r,t,nums);
        }
    }
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r= nums.length-1;

        int result = b_serch(l,r,target,nums);
        return result;
    }
}