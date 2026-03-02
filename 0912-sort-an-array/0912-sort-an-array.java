class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums; 
    }

    public void mergeSort(int[] nums, int l,int r){
        if(l < r){
            int mid = (l+r)/2;

            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
    }
    public void merge(int[] nums,int l, int mid, int r){
        int n = mid-l+1;
        int m = r-mid; 

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        int left = 0, right = 0; 

        for(int i = 0; i < n; i++){
            arr1[i] = nums[i+l];
        }

        for(int i = 0; i < m; i++){
            arr2[i] = nums[mid+i+1];
        }
        int ind = l; 

        while(left < n && right  < m){
            if(arr1[left] < arr2[right]){
                nums[ind] = arr1[left++];
                ind++; 
            }
            else if(arr2[right] < arr1[left]){
                nums[ind] = arr2[right++];
                ind++; 
            }
            else{
                nums[ind] = arr1[left];
                left++;
                ind++; 
            }

        }
        while(left < n){
            nums[ind++]  = arr1[left++];
        }

        while(right < m){
            nums[ind++] = arr2[right++];
        }
    }
}