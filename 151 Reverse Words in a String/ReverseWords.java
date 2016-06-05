public class ReverseWords {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("[\\s]+");
        
        if (words.length == 0) {
            return "";
        }
            
        
        if (words.length == 1) {
            return words[0];
        }
        
        StringBuilder returnString = new StringBuilder();
        
        returnString.append(words[words.length-1]);
        
        for(int i = words.length - 2; i >=0; i--) {
            returnString.append(" ");
            returnString.append(words[i]);
        }
        
        return returnString.toString();
    }
}