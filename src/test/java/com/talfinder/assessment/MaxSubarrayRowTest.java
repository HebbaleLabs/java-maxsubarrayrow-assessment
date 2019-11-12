package com.talfinder.assessment;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MaxSubarrayRowTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        int[][] matrix_3x4 = {
                { 1,  2,  0},
                { 4, -1,  2},
                { 6, -2,  3},
                {-1,  6, -1},
        };
        int output_3x4 = 2;

        int[][] matrix_1x1 = {
                {1}
        };
        int output_1x1 = 0;

        int[][] matrix_1x2 = {
                {1, -1}
        };
        int output_1x2 = 0;

        int[][] matrix_3x1 = {
                {1},
                {0},
                {2},
        };
        int output_3x1 = 2;

        int[][] matrix_3x3_diag = {
                {1,0,0},
                {0,1,0},
                {0,0,1},
        };
        int output_3x3_diag = 0;

        int[][] matrix_5x5 = {
                {1,0,-1,7,2},
                {0,-5,4,1,3},
                {-5,-2,9,1,2},
                {1,-2,2,8,-7},
                {4,-1,2,5,-8},
        };
        int output_5x5 = 2;

        int[][] matrix_3x3_negative = {
                {-9,-3,-1},
                {-4,-5,-2},
                {-3,-5,-3}
        };
        int output_3x3_negative = 0;

        int[][] matrix_3x3_equal = {
                {-1,-1,-1},
                { 9, 9, 9},
                {-2,-2,-2}
        };
        int output_3x3_equal = 1;

        return Arrays.asList(new Object[][] {
                {matrix_3x4, output_3x4},
                {matrix_1x1, output_1x1},
                {matrix_1x2, output_1x2},
                {matrix_3x1, output_3x1},
                {matrix_3x3_diag, output_3x3_diag},
                {matrix_5x5, output_5x5},
                {matrix_3x3_negative, output_3x3_negative},
                {matrix_3x3_equal, output_3x3_equal}
        });
    }

    private final int[][] input;
    private final int expected;

    public MaxSubarrayRowTest(int[][] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testMaxSubarrayRow() {
        Assert.assertEquals("input:" + Arrays.deepToString(input), expected, MaxSubarrayRow.maxSubarrayRow(input));
    }
}
