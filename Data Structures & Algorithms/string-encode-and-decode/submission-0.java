class Solution {
    public final static char SEPARATOR = '#';
    public String encode(List<String> strs) {
	    StringBuilder sb = new StringBuilder();	
		for(int i=0;i<strs.size();i++)
		{
			int subSize = strs.get(i).length();
			sb.append(subSize);
			sb.append(SEPARATOR);
			sb.append(strs.get(i));
		}
		
		return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<String>();
    if (str == null || str.isEmpty()) {
        return result;  // encoded empty list → []
    }
    int i = 0;
    int n = str.length();
    while (i < n) {
        // read length digits until '#'
        int j = i;
        while (j < n && str.charAt(j) != SEPARATOR) {
            j++;
        }
        int len = Integer.parseInt(str.substring(i, j));
        j++; // skip '#'
        // empty string: len == 0 → substring(j, j) == ""
        result.add(str.substring(j, j + len));
        i = j + len;
    }
    return result;
    }
}
