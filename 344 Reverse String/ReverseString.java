public class ReverseString {
    public String reverseString(String s) {
        //finding the lenght of the string
        int length = s.length();
        
        //Create the return object for the reverse string
        StringBuilder returnString = new StringBuilder();
        
        //for loop, beginning at the last index, and continuing to the first index of the word
        for(int i = length - 1; i >= 0; i--) {
            
          //append the current character to the return string
          returnString.append(s.charAt(i));
        }
        
        //return the completed reversed string.
        return returnString.toString();
    }
}