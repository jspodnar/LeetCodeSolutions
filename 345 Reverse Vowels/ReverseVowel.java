public class ReverseVowel {
  
  
    public String reverseVowels(String s) {
        
        //create retun string with consenents in the correct place
        StringBuilder returnString = new StringBuilder(s);
        

        
        //beginnning index
        int i = 0;
        
        //ending index
        int j = s.length() - 1;
        while (i < j) {
            
            while (!isVowel(s.charAt(i)) && i<j) {
                i++;
            }
            while (!isVowel(s.charAt(j)) && i<j) {
                j--;
            }
            
            returnString.setCharAt(i, s.charAt(j));
            returnString.setCharAt(j, s.charAt(i));
            
            i++;
            j--;
        
        }
        
        
        return returnString.toString();
        
    }
    
    public boolean isVowel(char c) {
        //define what a vowel is
        char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i <vowel.length; i++) {
            if (c == vowel[i])   {
                return true;
            } 
        }
        
        
        //if we reach here, it is not a vowel
       return false;
    }
}