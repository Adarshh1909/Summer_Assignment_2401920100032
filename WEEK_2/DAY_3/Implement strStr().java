class Solution {
    public int strStr(String s, String p) {

        for(int i=0;i<=s.length()-p.length();i++){

            int k=0;

            while(k<p.length() && s.charAt(i+k)==p.charAt(k)){
                k++;
            }

            if(k==p.length()){
                return i;
            }
        }

        return -1;
    }
}