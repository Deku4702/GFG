class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];
        int max = Integer.MIN_VALUE;

        for(int i = len - 1 ; i >= 0 ; i --){
           ans[i] = max;
           if(arr[i] > max){
                    max=arr[i];
            }
        }

        ans[len - 1 ] = -1;

        return ans;

    }
}
