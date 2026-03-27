class Solution {
    public List<String> letterCasePermutation(String s) {
        
 

        List<String> list = new ArrayList<>();

        char[] arr = s.toCharArray();
        casePermutation(arr,list,0);
        return list; 

    }

    public void casePermutation(char[] arr, List<String> list, int ind){
        
        
        while(ind < arr.length && Character.isDigit(arr[ind])) ind++; 
        

        if(ind >= arr.length){
            list.add(String.valueOf(arr));
            return; 
        }

        char ch = arr[ind];

        if(Character.isUpperCase(ch)){
            arr[ind] = Character.toLowerCase(ch);
        }
        else arr[ind] = Character.toUpperCase(ch);
        casePermutation(arr,list,ind+1);

    
        arr[ind] = ch; 
        casePermutation(arr,list,ind+1);
    }
}