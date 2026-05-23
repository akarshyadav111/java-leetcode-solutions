class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int max=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }else{
                int profit = arr[i] - min;
                max = Math.max(max, profit);
            }
        }
        return max;
    }
}