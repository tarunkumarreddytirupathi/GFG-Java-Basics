/* 




copy the below code and execute in GFG


class Solution {
    static String delAlternate(String S) {
    String str="";
    for(int i=0;i<S.length();i++){
        if(i%2!=0)
        continue;
        char c=S.charAt(i);
        str+=c;
        }
        return str;
    }
}

*/