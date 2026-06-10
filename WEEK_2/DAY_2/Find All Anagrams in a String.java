class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int k = p.length();

        for(int i=0;i<=s.length()-k;i++){

            String sub = s.substring(i,i+k);

            if(check(sub,p)){
                ans.add(i);
            }
        }

        return ans;
    }

    boolean check(String a,String b){

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x,y);
    }
}