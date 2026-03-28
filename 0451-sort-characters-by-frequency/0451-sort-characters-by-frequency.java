class Solution {
    public String frequencySort(String s) {
        char[] str = s.toCharArray();
        int n = str.length; 
        Arrays.sort(str);

        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch = str[i];
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        mergeSort(str,0,n-1,hash);
        return String.valueOf(str);

    }

    public void mergeSort(char[] str,int l, int r, HashMap<Character,Integer> hash){
        if(l >= r) return; 

        int mid = (l+r)/2;

        mergeSort(str,l,mid,hash);
        mergeSort(str,mid+1,r,hash);
        merge(str,l,mid,r,hash);
    }

    public void merge(char[] arr, int l, int mid, int r, HashMap<Character,Integer> freq){

        int len1 = mid-l+1; 
        int len2 = r-mid; 

        char[] arr1 = new  char[len1];
        char[] arr2 = new char[len2];

        for(int i = 0; i < len1; i++){
            arr1[i] = arr[l+i];
        }

        for(int i = 0; i < len2; i++){
            arr2[i] = arr[mid+1+i];
        }

        int left = 0, right = 0, ind = l;

        while(left < len1 && right < len2){

            int val1 = freq.get(arr1[left]);
            int val2 = freq.get(arr2[right]);

            if(val2 > val1){
                arr[ind] = arr2[right];
                right++; 
            }
            else{
                arr[ind] = arr1[left];
                left++; 
            }
            ind++; 
        }

        while(left < len1){
            arr[ind++] = arr1[left++];
        }

        while(right < len2){
            arr[ind++] = arr2[right++];
        }

    }
}