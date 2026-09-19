class Solution {
    public int characterReplacement(String s, int k) {
         if (s == null || s.length() == 0) return 0;
	    int[] freq = new int[26];
	    int left = 0;
	    int maxFreq = 0;
	    int count = 0;
	    for (int right = 0; right < s.length(); right++) {
	        int idx = s.charAt(right) - 'A';
	        freq[idx]++;
	        maxFreq = Math.max(maxFreq, freq[idx]);
	        // replacements needed = window size - majority count
	        while ((right - left + 1) - maxFreq > k) {
	            freq[s.charAt(left) - 'A']--;
	            left++;
	        }
	        count = Math.max(count, right - left + 1);
	    }
	    return count;
    }
}
