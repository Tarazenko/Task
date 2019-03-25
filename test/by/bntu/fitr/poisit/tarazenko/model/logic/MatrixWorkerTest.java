package by.bntu.fitr.poisit.tarazenko.model.logic;

import by.bntu.fitr.poisit.tarazenko.model.data.Array;
import org.junit.Test;
import by.bntu.fitr.poisit.tarazenko.model.data.Matrix;

import static org.junit.Assert.*;

public class MatrixWorkerTest {
    private Matrix matrix1 = new Matrix(new double[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}});
    private Matrix matrix2 = new Matrix(new double[][]{
            {4, 1, 0},
            {4, 1, 8},
            {4, 1, 9}});
    private Matrix matrix3 = new Matrix(null);
    @Test
    public void findLowerValueColumnMinComp() {
        assertEquals(-1, MatrixWorker.findLowerValueColumnMinComp(matrix1,1));
        assertEquals(1, MatrixWorker.findLowerValueColumnMinComp(matrix2,5));
        assertEquals(2, MatrixWorker.findLowerValueColumnMinComp(matrix2,10));
        assertEquals(-1, MatrixWorker.findLowerValueColumnMinComp(matrix3,10));
    }

    @Test
    public void findCompInLowerValueColumns() {
        Array expected = new Array(new double[]{Double.POSITIVE_INFINITY,
                Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY});
        Array actual = MatrixWorker.findCompInLowerValueColumns(matrix1,1);
        assertEquals(expected.toString(), actual.toString());

        expected = new Array(new double[]{64,1,0});
        actual = MatrixWorker.findCompInLowerValueColumns(matrix2,10);
        assertEquals(expected.toString(), actual.toString());

        expected = new Array(null);
        actual = MatrixWorker.findCompInLowerValueColumns(matrix3,10);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void findMinPos() {
        Array array = new Array(new double[]{Double.POSITIVE_INFINITY,
                Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY});

        assertEquals(-1, MatrixWorker.findMinPos(array));

        array = new Array(null);
        assertEquals(-1, MatrixWorker.findMinPos(array));

        array = new Array(new double[]{60, -1.0, -1.6});
        assertEquals(2, MatrixWorker.findMinPos(array));
    }
}