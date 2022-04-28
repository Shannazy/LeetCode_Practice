package Roman_Num;

import java.util.HashMap;

public class Roman_numerals {
    public int romanToInt(String s) {
        int finalVal = 0;
        HashMap<String, Integer> dictionary= new HashMap<>();
        dictionary.put("I", 1); dictionary.put("IV", 4);
        dictionary.put("V", 5);dictionary.put("IX", 9);
        dictionary.put("X", 10);dictionary.put("XL", 40);
        dictionary.put("L", 50);dictionary.put("XC", 90);
        dictionary.put("C", 100);dictionary.put("CD", 400);
        dictionary.put("D", 500);dictionary.put("CM", 900);
        dictionary.put("M", 1000);
        //System.out.println(dictionary);

        int counter = 0;
        while (counter < s.length()){
            String nextChar = "";
            char currentChar = s.charAt(counter);
                if (counter != s.length()-1){
                    nextChar = nextChar + s.charAt(counter + 1);
                }
            if (dictionary.containsKey(currentChar + nextChar)){
                finalVal = finalVal + dictionary.get(currentChar + nextChar);
                counter = counter +2;
            }
            else{
                finalVal = finalVal + dictionary.get(Character.toString(currentChar));
                counter++;
            }
        }
    return finalVal;

    }
}
