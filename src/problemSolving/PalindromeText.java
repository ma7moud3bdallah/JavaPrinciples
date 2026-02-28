package problemSolving;

public class PalindromeText {
    static void main(String[] args) {
        String text = "madam";
        boolean isPalindrome = false;
        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i)==text.charAt(text.length()-1-i)){
                isPalindrome = true;
            }
        }
        if(isPalindrome){
            System.out.println("The text is palindrome");
        }
        else{
            System.out.println("The text is not palindrome");
        }
    }
}
