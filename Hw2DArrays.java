package javaHw;

public class Hw2DArrays {
    public static void main(String[] args) {
        /*
       Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        Then your program should print name of the students that has A and B grade*/

        String [][]students={
                {"Alex","Berry","Almor","beast"},
                {"A","B","C","D"}
        };
       for(int i=0;i<students.length;i++){
           for(int j=0;j< students[i].length;j++){
               if(students[i][j].equals("A")||students[i][j].equals("B")){
                   System.out.println(students[0][j]);
               }
           }
       }





    }
}
