public class reverse {
    
    public static String reverseString(String originalString) {
        int length = originalString.length();
        StringBuilder reversed = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reversed.append(originalString.charAt(i));
        }
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        String originalString = "Brijendra Pratap";
        String reversedString = reverseString(originalString);
        System.out.println(reversedString);
    }
    
}
