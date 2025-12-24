class Solution {
    public String validIPAddress(String queryIP) {
        if (queryIP.length() == 0) return "Neither";

        if(queryIP.charAt(queryIP.length()-1)=='.' || queryIP.charAt(queryIP.length()-1)==':') return "Neither";
        if(queryIP.contains(".")){
            if(queryIP.contains(":")) return "Neither";
                String[] arr = queryIP.split("\\.");
                if (checkIPv4(arr)){
                    return "IPv4";
                }
        }else if(queryIP.contains(":")) {  
            if(queryIP.contains("."))return "Neither";
            String[] arr = queryIP.split(":");
            if(checkIPv6(arr)) return "IPv6"; 


        }
        return "Neither";
    }

    public boolean checkIPv6(String[] arr){
        if(arr.length != 8) return false; 

        for(int i = 0; i < arr.length; i++){
            int len = arr[i].length();
            String str = arr[i];
            if(len < 1 || len > 4) return false; 
            for(int j = 0; j < len; j++){

                char ch = str.charAt(j);
                if (!(
                        (ch >= '0' && ch <= '9') ||
                        (ch >= 'a' && ch <= 'f') ||
                        (ch >= 'A' && ch <= 'F')
                )) return false; 
 
            }
        }
        return true; 

    }



    public boolean checkIPv4(String[] arr){
        if(arr.length != 4) return false; 
 
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 3) return false; 
            try{
                if(arr[i].charAt(0)=='0' && arr[i].length()!=1) return false; 
                int num = Integer.parseInt(arr[i]);
                if(num <= 255 && num >= 0){
                    continue; 
                }else{
                    return false; 
                }
            } catch(Exception e){
                return false; 
              
            }
        }
        return true; 
    }
}