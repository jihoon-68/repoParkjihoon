package org.example.Head01_JavaProgrammingStart;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6}
        };

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
