package PreFix_Finder;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

    if (strs.length ==0 || strs == null){
        return "";
    }
    for (int x = 0; x < strs[0].length(); x++){ //run thru the letters of all the first word
        char prime = strs[0].charAt(x);
        for (int j = 0; j < strs.length; j++){
            if (x == strs[j].length() || prime != strs[j].charAt(x) ){ //check to see if the second word is smaller first then do a char check
                return strs[0].substring(0,x); //return the inner string till point of failure
            }
        }
    }
    return strs[0]; //if we make it out of the for loop that means the first word entirely is a prefix
    }
}
