package day5;

public class MultiDimensionalArray {
    static void main(String[] args) {
        int grades[][] = new int[5][4];

        grades[0][0] = 90;
        grades[0][1] = 85;
        grades[0][2] = 70;
        grades[0][3] = 95;
        grades[1][0] = 65;
        grades[1][1] = 45;
        grades[1][2] = 80;
        grades[1][3] = 75;
        grades[2][0] = 50;
        grades[2][1] = 85;
        grades[2][2] = 90;
        grades[2][3] = 65;
        grades[3][0] = 40;
        grades[3][1] = 85;
        grades[3][2] = 90;
        grades[3][3] = 85;
        grades[4][0] = 90;
        grades[4][1] = 75;
        grades[4][2] = 50;
        grades[4][3] = 85;

        System.out.println("No. of rows: "+grades.length);
        System.out.println("No of columns: "+grades[0].length);

        System.out.println("Value of row 1 column 2: "+grades[0][1]);

        System.out.print("MultiDimensionArray is: ");
        for(int i=0;i<grades.length;i++){
            for(int j=0;j<grades[i].length;j++){
                System.out.print(grades[i][j]+" | ");
            }
        }
    }
}
