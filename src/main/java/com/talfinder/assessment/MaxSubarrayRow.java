package com.talfinder.assessment;

public class MaxSubarrayRow {

    public static int maxSubarrayRow(int[][] matrix) {
        /*
         * NOTE:
         * 1. Write your solution within this method
         * 2. Do not make changes to the Class Name, Method Name or Method Signature
         * 3. Use the Run-Java command to run main method
         * 4. Use the BuildAndRunTests command to evaluate your solution
         */
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  0},
                { 4, -1,  2},
                { 6, -2,  3},
                {-1,  6, -1},
        };
        int rowWithMaxSubArray = maxSubarrayRow(matrix);
        System.out.println("Row with maximum subarray is:" + rowWithMaxSubArray);
    }
}
