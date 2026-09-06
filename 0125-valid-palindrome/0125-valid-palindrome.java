class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String p="";
        StringBuilder sb=new StringBuilder(p);
        int left=0;

        while(left<s.length()){
            if((s.charAt(left)>='a' && s.charAt(left)<='z') || (s.charAt(left)>='0' && s.charAt(left)<='9')){
            sb.append(s.charAt(left));
           
            }

             left++;
                   }
             boolean bo=sb.toString().equals((sb.reverse()).toString());
                System.out.print(sb);
                return bo;
    }
}