class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();


        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch==']'){
                StringBuilder sb2 = new StringBuilder();
                while(stack.peek()!='['){
                    sb2.insert(0,stack.pop());
                }
                stack.pop();
                
                if(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    String str = "";
                    while( !stack.isEmpty() && Character.isDigit(stack.peek())){
                        str = stack.pop() + str;
                    }
   
                    int num = Integer.parseInt(str);
                    StringBuilder expand = new StringBuilder();
                    String temp = sb2.toString();
                    for(int j = 0; j < num; j++){
                        expand.append(temp);     
                    }
 
                    for(char c: expand.toString().toCharArray()){
                        stack.push(c);
                    }

                }
                
            }
           else stack.push(ch);
            
        }   

        for(char c: stack){
            sb.append(c);
        }

        return new String(sb);
        
    }
}