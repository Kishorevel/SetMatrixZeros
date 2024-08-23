package Kishorevel;
import java.util.*;
//LeetCode 73. Set Matrix Zeroes
public class MatrixZeros {
    public static void main(String[] args){
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        
        findInd(matrix, matrix.length, matrix[0].length); //Passing the Matrix

        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i])+" "); //Print here!
        }
    }

    static void findInd(int[][] matrix, int r, int c){
        boolean [][] setTrue = new boolean[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){ // Check if the matrix is 0
                    setZero(matrix, setTrue, i, j); // Passing ori and bool matrix with it's indexes which are 0
                }
            }
        }

        for(int i=0;i<setTrue.length;i++){
            for(int j=0;j<setTrue[0].length;j++){
                if(setTrue[i][j]){ // If it is true set the value to 0
                    matrix[i][j]=0;
                }
            }
        }
    }

    static void setZero(int[][] matrix, boolean[][] setTrue, int a, int b){
        for(int i=0;i<matrix.length;i++){
            setTrue[i][b]=true; // Set the entire row to true
        }
        for(int j=0;j<matrix[0].length;j++){
            setTrue[a][j]=true; // Set the entire column to true
        }
    }
}
// O/P
// [0, 0, 0, 0] 
// [0, 4, 5, 0] 
// [0, 3, 1, 0] 
