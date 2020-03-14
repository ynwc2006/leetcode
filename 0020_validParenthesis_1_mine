class Solution {
    public static boolean isValid(String s) {
        if (s.length() == 0) return true;
        String q = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int qlen = q.length();
            switch (c) {
                case ')':
                    if (qlen == 0) return false;
                    if (q.lastIndexOf('(') == qlen - 1)
                        q = qlen == 1 ? "" : q.substring(0, qlen - 1);
                    else return false;
                    break;
                case ']':
                    if (qlen == 0) return false;
                    if (q.lastIndexOf('[') == qlen - 1)
                        q = qlen == 1 ? "" : q.substring(0, qlen - 1);
                    else return false;
                    break;
                case '}':
                    if (qlen == 0) return false;
                    if (q.lastIndexOf('{') == qlen - 1)
                        q = qlen == 1 ? "" : q.substring(0, qlen - 1);
                    else return false;
                    break;
                case '(':
                case '{':
                case '[':
                    q = q + c;
            }
        }
        return q == "";
    }
    
}
