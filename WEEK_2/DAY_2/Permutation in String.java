class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();

        char[] a = s1.toCharArray();
        Arrays.sort(a);

        for(int i=0;i<=s2.length()-n;i++){

            String sub = s2.substring(i,i+n);

            char[] b = sub.toCharArray();
            Arrays.sort(b);

            if(Arrays.equals(a,b)){
                return true;
            }
        }

        return false;
    }
}