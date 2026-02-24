class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums; 
    }

    public void mergeSort(int[] arr, int l, int r){
        if(l < r){  
        int mid = (l+r)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        }
    }

    public void merge(int[] arr, int l, int mid, int r){
        int len1 = mid - l +1;   // I can't think through this line of of code, the fixing the size of the array. 
        int len2 = r - mid;

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        for(int i = 0; i < len1; i++){
            arr1[i] =  arr[l+i];
        }

        for(int i = 0; i < len2; i++){
            arr2[i] = arr[mid+1+i];
        }

        int i = 0, j = 0,ind = l; 

        while(i < len1 && j < len2){
            int left = arr1[i];
            int right = arr2[j];

            if(left < right){
                arr[ind] = left; 
                ind++; 
                i++; 
            }
            else if(right < left){
                arr[ind] = right; 
                ind++;
                j++;  
            }
            else{
                arr[ind]= left; 
                ind++; 
                i++; 
            }
        }

        while(i < len1){
            arr[ind++] = arr1[i];
            i++; 
        }

        while(j < len2){
            arr[ind++] = arr2[j];
            j++; 
        }

    }
}