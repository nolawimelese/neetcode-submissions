class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (int i = 0; i < strs.length; i++)
        {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String key = new String(word);
            if (anagrams.containsKey(key))
            {
                anagrams.get(key).add(strs[i]);
            }
            else
            {
                anagrams.put(key, new ArrayList<String>());
                anagrams.get(key).add(strs[i]);
            }
        }
        List<List<String>> ret = new ArrayList<>();
        for (String key : anagrams.keySet())
        {
            ret.add(anagrams.get(key));
        }
        return ret;
    }
}