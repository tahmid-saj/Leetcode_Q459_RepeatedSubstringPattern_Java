class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1) {
            return false;
        }

        String sub = "";

        for (int i = 0; i < s.length() / 2; i++) {
            sub = s.substring(0, i + 1);

            for (int j = sub.length(); j < s.length() + 1 - sub.length(); j += sub.length()) {
                if (!(s.substring(j, sub.length() + j)).equals(sub)) {
                    break;
                } else if (j == s.length() - sub.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}
