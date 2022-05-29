package StringOfString;

class Solution {
    public int strStr(String haystack, String needle) {
        char[] hayStack = haystack.toCharArray();
        char[] charNeedle = needle.toCharArray();
        boolean found = false;
        if(needle.isBlank() || needle.isEmpty()){
            return 0;
        } else if (charNeedle.length > hayStack.length) {
            return -1;

        } else {

            for (int i = 0; i < hayStack.length; i++){
                for (int j = 0; j< charNeedle.length; j++){
                    if(i+j == hayStack.length ||charNeedle[j] != hayStack[i+j]){
                        break;
                    }
                    if(j == charNeedle.length -1 ){
                        return i;
                    }
                }
            }
            return -1;
        }
    }
}
