class Solution {
    public int search(int[] nums, int target) {
        
        int left=0;
        int right=nums.length-1;
        while(left<=right){

            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid] ){
                    right=mid-1;
                }
                //target must be in the right half
                else{
                    left=mid+1;
                }
            }
            //otherwise the right half is sorted
            else{
                //target is in the sorted right half
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;
                }
                //target must be in the left half
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
        
    }
}
