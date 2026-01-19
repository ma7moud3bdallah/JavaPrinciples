package day6;

public class TextProcessor {
    static void main(String[] args) {
//        countWords("Hello World");
//        reverseText("Mahmoud");
//        addSpace("HelloWorld");

//        String name = "   Ahmed";
//        name.trim();
//        System.out.println(name);
//        name = "mohamed";
//        System.out.println(name);

        String s1 = "Ahmed"; // Stored in String pool
        String s2 = "Ahmed";
        String s3 = new String("Ahmed"); // Stored as copy in heap memory
        String s4 = new String("Ahmed");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1==s2); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1==s3); // false
        System.out.println(s3.equals(s4)); // true
        System.out.println(s3==s4); // false
////
    }
    static void countWords(String text){
        String words[] = text.split(" ");   //Delimiters needed to be escaped: . ? ( { [ * + $ |
        String message = String.format("Text contains %d words",words.length);
        System.out.println(message);
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+" | ");
        }
        System.out.println();
    }
    static void reverseText(String text){
//        for(int i=text.length()-1;i>=0;i--){
//            System.out.print(text.charAt(i));
//        }
        StringBuilder reversed = new StringBuilder(text);
        System.out.println(reversed.reverse());
    }
    static void addSpace(String text){
        StringBuilder modifiedText = new StringBuilder(text);
        for(int i=1;i<modifiedText.length();i++){
            if(Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
