class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();

        boolean present = false;
        int ind = 0; 
        int n = word.length();

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            stack.push(c);
            if(c==ch){
                present = true; 
                ind = i; 
                break; 
            }
        }

        StringBuilder sb = new StringBuilder();
        if(present){
            while(!stack.isEmpty()){
                  sb.append(stack.pop());
            }
            return sb.toString() + word.substring(ind+1,n);            
        }

        return word; 
        
    }
}