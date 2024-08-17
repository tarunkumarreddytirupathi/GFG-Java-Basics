/* 




copy the below code and execute in GFG


class Solution {
    
     static  String  reverse(String s,int len,String str){
        if(len==0){
             str+=s.charAt(len);
             return str;
        }
        else{
           str+=s.charAt(len);
             --len;
            return reverse(s,len,str);
        }
        
    }
    
    
    static String conRevstr(String S1, String S2) {
        String str="";
        str+=S1+S2;
        int len=str.length()-1;
        String str1="";
        str=reverse(str,len,str1);
    return str;

    }
}

*/