package day6;

public class TextProcessor {
    static void main(String[] args) {
//        countWords("Hello World");
//        reverseText("Mahmoud");
        addSpace("HelloWorld");
    }
    static void countWords(String text){
        String words[] = text.split(" ");
        String message = String.format("Text contains %d words",words.length);
        System.out.println(message);
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+" | ");
        }
        System.out.println();
    }
    static void reverseText(String text){
        for(int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
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
