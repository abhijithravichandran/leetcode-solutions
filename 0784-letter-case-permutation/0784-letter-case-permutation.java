class Solution {
    public List<String> letterCasePermutation(String s) {
        char[] str = s.toCharArray();
        List<String> res = new ArrayList<>();
        permutations(str,res,0);
        return res; 

    }

    public void permutations(char[] arr, List<String> res, int ind){

        while(ind < arr.length && Character.isDigit(arr[ind])){
            ind++; 
        }

        if(ind==arr.length){
            res.add(new String(arr));
            return; 
        }

        char ch = arr[ind];

        if(Character.isLowerCase(ch)) arr[ind] = Character.toUpperCase(ch);
        else arr[ind] = Character.toLowerCase(ch);
        permutations(arr,res,ind+1);

        arr[ind] = ch; 
        permutations(arr,res,ind+1);
    }   
}