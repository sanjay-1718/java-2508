package Concepts;

public class Array {
    public static void main(String[] args) {
        //single dimensional array
        int [] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        System.out.println("1st Element: " +nums[0]);
        System.out.println("2nd Element: " +nums[1]);
        System.out.println("3rd Element: " +nums[2]);

        int [] marks = {90,87,86,89,77,67,70};
        int totalMarks = 0;
        int avgMarks = 0;
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
            totalMarks += marks[i];
        }
        System.out.println("Total Marks: " +totalMarks);
        avgMarks = totalMarks/marks.length;
        System.out.println("Average Marks: " +avgMarks);

        //multidimensional array
        int [][] numbers = new int[3][2];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;
        numbers[2][0] = 5;
        numbers[2][1] = 6;

        System.out.println("1st Element: " +numbers[0][0]);
    }

}
