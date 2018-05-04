class Solution {
    public boolean isPalindrome(String s) {
        Deque<Character> dq = new LinkedList<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                dq.offerLast(c);
            }
        }
        int size = dq.size();
        for (int i = 0;  i < size/2; i++) {
            char left = dq.pollFirst();
            char right = dq.pollLast();
            if (left != right) {
                return false;
            }
        } 
        return true;
    }
}
