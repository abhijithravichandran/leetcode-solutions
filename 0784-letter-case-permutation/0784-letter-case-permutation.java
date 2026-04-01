class Solution {
    public List<String> letterCasePermutation(String s) {
        char[] arr = s.toCharArray();
        List<String> res = new ArrayList<>();
        permutations(arr,res,0);
        return res; 
    }

    public void permutations(char[] arr, List<String> res, int ind){

        while(ind < arr.length && !Character.isLetter(arr[ind])){
            ind++; 
        }
        
        if(ind==arr.length){
            res.add(new String(arr));
            return; 
        }

        
        

        char ch = arr[ind];

        if(Character.isUpperCase(ch)) arr[ind] = Character.toLowerCase(ch);
        else if(Character.isLowerCase(ch)) arr[ind] = Character.toUpperCase(ch);
        permutations(arr,res,ind+1);

        arr[ind] = ch; 
        permutations(arr,res,ind+1);
    }
}