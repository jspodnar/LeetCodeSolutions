public class ReverseInt {
    public int reverse(int x) {
        String word = "" + x;
        char[] letters = word.toCharArray();
        
        StringBuilder reversed = new StringBuilder();
        
        if (letters[0] == '-') {
            reversed.append("-");
            for (int i = letters.length - 1; i >0; i--) {
                reversed.append(letters[i]);
            }
        }
        
        else {
            for (int i = letters.length-1; i >=0; i--) {
                reversed.append(letters[i]);
            }
        }
        
        try {
            return Integer.parseInt(reversed.toString());
        } 
        catch (NumberFormatException e) {
            return 0;    
        }
        
        
    }
}