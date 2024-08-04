/* 




copy the below code and execute in GFG


class Solution {
    static String revStr(String s) {
      
        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        String reversedString = new String(charArray);
        return reversedString;
    }
}

*/