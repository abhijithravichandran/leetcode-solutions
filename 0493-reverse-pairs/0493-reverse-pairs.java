class Solution {
    int cnt = 0; 
    public int reversePairs(int[] nums) {
        cnt = 0; 
        mergeSort(nums,0,nums.length-1);
        return cnt; 
    }

    public void mergeSort(int[] arr, int l, int r){
        if(l >= r){
            return; 
        }
        int mid = (l+r)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public void countPair(int[] arr1, int[] arr2){
        int n1 = arr1.length; 
        int n2 = arr2.length; 

        int l = 0, r = 0; 

        while(l < n1 && r < n2){
            long num1 = arr1[l];
            long num2 = arr2[r];
            if(num1 > num2*2){
                cnt += (n1-l);
                r++; 
            }
            else{
                l++; 
            }
        }

    }

    public void merge(int[] arr, int l, int mid, int r){

        int len1 = mid-l+1;
        int len2 = r-mid;

        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        for(int i = 0; i < len1; i++){
            arr1[i] = arr[l+i]; 
        }

        for(int i = 0; i < len2; i++){
            arr2[i] = arr[mid+i+1];
        }

        countPair(arr1,arr2);

        int right = 0, left = 0, ind = l; 
        while(left < len1 && right < len2){

            if(arr1[left] < arr2[right]){
                arr[ind] = arr1[left];
                left++; 
            }
            else{
                arr[ind] = arr2[right];
                right++; 
            }
            ind++; 
        }

        while(left < len1){
            arr[ind] = arr1[left];
            ind++; 
            left++; 
        }

        while(right < len2){
            arr[ind++] = arr2[right++];
        }

    }
}