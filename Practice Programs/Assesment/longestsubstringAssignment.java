public class longestsubstringAssignment {
    public static int lengthOfLongestSubstring(String s){
        int maxlength=0;
        String  temp="";
        for(char c:s.toCharArray()){
            String sc= String.valueOf(c);
            if(temp.contains(sc)){
                temp = temp.substring(temp.indexOf(sc)+1);
            }
            temp += c;
            maxlength = Math.max(maxlength,temp.length());
        }
        return maxlength;
    }
    
}