/* 

copy the below code and execute in GFG

class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        Arrays.sort(v1);
        Arrays.sort(v2);
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while(i < v1.length && j < v2.length) {
            if(v1[i] == v2[j]) {
                ans.add(v1[i]);
                i++;
                j++;
            }
            else if(v1[i] > v2[j]) {
                j++;
            }
            else {
                i++;
            }
        }
        return ans;
    }
}

*/