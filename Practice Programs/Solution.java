import java.util.HashMap;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (charIndexMap.containsKey(s.charAt(right)) && charIndexMap.get(s.charAt(right)) >= left) {
                left = charIndexMap.get(s.charAt(right)) + 1;
            }
            charIndexMap.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        } 
        return maxLength;
    } 
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
