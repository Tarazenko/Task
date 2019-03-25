package by.bntu.fitr.poisit.tarazenko.model.logic;

import by.bntu.fitr.poisit.tarazenko.model.data.Array;
import by.bntu.fitr.poisit.tarazenko.model.data.Matrix;

public class MatrixWorker {

    public static int findLowerValueColumnMinComp(Matrix matrix, double value) {
        return findMinPos(findCompInLowerValueColumns(matrix,value));
    }

    public static Array findCompInLowerValueColumns(Matrix matrix, double value) {
        Array columns = new Array(matrix.getCountColumns());
        for(int i = 0; i < columns.getSize(); i++)
            columns.setElement(i,Double.POSITIVE_INFINITY);
        for (int j = 0; j < matrix.getCountColumns(); j++) {
            boolean flag = false;
            double comp = 1;
            for (int i = 0; i < matrix.getCountRows(); i++) {
                comp *= matrix.getElement(i,j);
                if (matrix.getElement(i,j) > value) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                columns.setElement(j,comp);
            }
        }
        return columns;
    }

    public static int findMinPos(Array array) {
        int pos = -1;
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < array.getSize(); i++) {
            if (array.getElement(i) < min) {
                min = array.getElement(i);
                pos = i;
            }
        }
        return pos;
    }
}
