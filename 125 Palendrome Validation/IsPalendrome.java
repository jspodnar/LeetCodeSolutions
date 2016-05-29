public class IsPalendrome {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        
        int startingPointer = 0;
        int endingPointer = s.length() - 1;
        
        while(startingPointer < endingPointer) {
            //find starting character
            if (!Character.isLetter(s.charAt(startingPointer)) && !Character.isDigit(s.charAt(startingPointer))) {
                startingPointer++;
                continue;
            }
            
            
            if (!Character.isLetter(s.charAt(endingPointer)) && !Character.isDigit(s.charAt(endingPointer))) {
                endingPointer--;
                continue;
            }
            
            if (Character.toLowerCase(s.charAt(startingPointer)) != (Character.toLowerCase(s.charAt(endingPointer))) ) {
                //Return not palindrome
                return false;
            }
            
            startingPointer++;
            endingPointer--;
    
        }
        
        return true;
        
    }
}