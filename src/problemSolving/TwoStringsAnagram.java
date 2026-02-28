package problemSolving;

import java.util.Arrays;

public class TwoStringsAnagram {
    static void main(String[] args) {
        String text1 = "listen";
        String text2 = "silent";
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
