/* 

copy the below code and execute in GFG

class Solution {
    public String average(int arr[]) {
        
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        
    
        double average = sum / (double) arr.length;
        
        return String.format("%.2f", average);
    }
}

*/