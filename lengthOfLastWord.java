class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        int len = arr.length;
        return arr[len-1].length();
    }
}
