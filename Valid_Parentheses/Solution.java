package Valid_Parentheses;

import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> dic = new HashMap<Character, Character>();
        dic.put('(', ')');
        dic.put('[', ']');
        dic.put('{', '}');

        int counter = 0;
        int innerCounter = 0;
        if(s.length()%2 == 1 || dic.containsValue(s.charAt(0))) {
            return false;
        }
        while (counter < s.length() - 1 ) {
            if (dic.containsKey(s.charAt(counter))) {
                if (dic.containsKey(s.charAt(counter + 1))) {
                    innerCounter++;
                    if(innerCounter == s.length() -1){
                        return false;
                    }
                    while (dic.containsKey(s.charAt(counter + innerCounter + 1))) {
                        innerCounter++;
                        if(innerCounter == s.length() -1){
                            return false;
                        }
                    }
                    int jumper = innerCounter + counter;
                    while (innerCounter > -1) {
                        int pair = (((jumper - innerCounter - counter) * 2) + 1) + counter + innerCounter;
                        if (pair >s.length()-1){
                            return false;
                        }
                        if (s.charAt(pair) != dic.get(s.charAt(counter + innerCounter))) {
                            return false;
                        }
                        innerCounter--;
                        if (innerCounter == -1) {
                            counter = counter + (((jumper - counter) * 2) + 1) + counter + 1;
                        }
                    }
                }
                else if (s.charAt(counter + 1) == dic.get(s.charAt(counter))) {
                    counter +=2;
                }
                else{
                    return false;
                }
            }
            else if(!dic.containsKey(s.charAt(counter))){
                return false;
            }
        }
        return true;
    }
}
