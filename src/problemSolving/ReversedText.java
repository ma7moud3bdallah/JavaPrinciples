package problemSolving;

public class ReversedText {
    static void main(String[] args) {
        String text = "IBM";
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }
}
