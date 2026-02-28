package problemSolving;

public class CountVowels {
    static void main(String[] args) {
        String word = "hello";
        char[] arrayOfChar = word.toCharArray();
        int count = 0;
        for(char character:arrayOfChar){
            if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u'){
                count++;
            }
        }
        System.out.println("Number of Vowels characters is: "+count);
    }
}
