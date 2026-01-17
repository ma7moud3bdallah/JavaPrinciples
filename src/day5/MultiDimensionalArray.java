package day5;

public class MultiDimensionalArray {
    static void main(String[] args) {
        int grades[][] = new int[5][4];

        grades[0][0] = 90;
        grades[0][1] = 85;
        grades[0][2] = 70;
        grades[0][3] = 95;

        System.out.println(grades.length);
        System.out.println(grades[0].length);

        System.out.println(grades[0][1]);

        for(int i=0;i< grades.length;i++){
            for(int j=0;j<grades[i].length;j++){
                System.out.print(grades[i][j]+" | ");
            }
        }
    }
}
