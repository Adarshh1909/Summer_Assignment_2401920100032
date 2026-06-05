class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb=new StringBuilder(new String(s));
        int start=0,end=s.length-1;
        while(end>start){
            char temp=sb.charAt(start);
            char temp2=sb.charAt(end);
            sb.setCharAt(start,temp2);
            sb.setCharAt(end,temp);
            start ++;
            end --;        }

        for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);

        }
    }}