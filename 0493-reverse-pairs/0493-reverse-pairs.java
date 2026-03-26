class Solution {
    long cnt; 
    public int reversePairs(int[] nums) {
        cnt = 0; 
        mergeSort(nums,0,nums.length-1);
        return (int) cnt; 
    }

    public void mergeSort(int[] nums, int l, int r){
        if(l >= r) return; 

        int mid = l+(r-l)/2;

        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    
    public void merge(int[] nums, int l, int mid, int r){

        int len1 = mid-l+1; 
        int len2 = r-mid; 

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        for(int i = 0;i < len1; i++){
            arr1[i] = nums[i+l];
        }

        for(int i = 0; i < len2; i++){
            arr2[i] = nums[mid+1+i];
        }

        cntReverse(arr1,arr2);

        int left = 0, right = 0, ind = l; 

        while(left < len1 && right < len2){

            if(arr1[left] < arr2[right]){
                nums[l] = arr1[left];
                left++; 
            }
            else{
                nums[l] = arr2[right];
                right++; 
            }
            l++; 
        }

        while(left < len1){
            nums[l++] = arr1[left++];
        } 

        while(right < len2){
            nums[l++] = arr2[right++];
        }
        

    }
    public void cntReverse(int[] arr1, int[] arr2){
        int l = 0, r = 0, len1 = arr1.length; 
        long num1 = 0, num2 = 0; 

        while(l < arr1.length && r < arr2.length){
            num1 = arr1[ l];
            num2 = arr2[ r];

            if(num1 >  num2*2){
                cnt += (len1-l);
                r++; 
            }
            else l++; 
            
        }
    }
}