//Brute force

class Solution {
    int missingNum(int arr[]) {
        
        int n = arr.length + 1;
        
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;
        
        for(int num : arr){
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}

//for longer constraint this formula (n + 1) * (n + 2) / 2;
class Solution {
    int missingNum(int arr[]) {
        
        int n = arr.length;
        
        long expectedSum = (long)(n + 1) * (n + 2) / 2;
        
        long actualSum = 0;
        
        for(int num : arr){
            actualSum += num;
        }
        
        return (int)(expectedSum - actualSum);
    }
}
