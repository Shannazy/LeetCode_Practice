package Palindrome;

class Solution {
  public boolean isPalindrome(int x){
    if (x < 0){
      return false;
    }
    else {
      String temp = Integer.toString(x);
      String reverse = "";
      char myChar;

      for(int i = 0; i<temp.length(); i++){
        myChar = temp.charAt(i);
        reverse = myChar+reverse;
      }
      try{
      if (x == Integer.valueOf(reverse)){
        return true;
      }
      else{return false;}
    } catch (Exception e){
      return false;
    }
    }
  }
}
