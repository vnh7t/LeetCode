class Solution {
    boolean match(int x1[],int x2[]){
        for(int i=0;i<26;i++){
            if(x1[i]!=x2[i]){
                return false;
            }
        }return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }
        int[] alphaFrequencys1= new int[26];
        
        for(int i=0; i<s1.length() ;i++){
            alphaFrequencys1[s1.charAt(i)-97]++;
        }
        
        for(int i=0; i<=s2.length()- s1.length();i++){
            int[] alphaFrequencys2= new int[26];
            for(int j=0; j<s1.length();j++){
             alphaFrequencys2[s2.charAt(j+i)-97]++;   
            }
            if(match(alphaFrequencys1,alphaFrequencys2)){
                return true; 
            }
        }
        return false;
    }
}
