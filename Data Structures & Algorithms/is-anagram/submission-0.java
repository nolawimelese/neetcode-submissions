class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        char[] Schars = s.toLowerCase().toCharArray();
        char[] Tchars = t.toLowerCase().toCharArray();
        for (int i = 0; i < Schars.length; i++)
            {
            count[Schars[i] - 'a']++;
            }

        for (int i = 0; i < Tchars.length; i++)
            {
            count[Tchars[i] - 'a']--;
            }

        for (int i = 0; i < count.length; i++)
            {
            if (count[i] != 0)
                return false;
            }
        return true;
    }
}
