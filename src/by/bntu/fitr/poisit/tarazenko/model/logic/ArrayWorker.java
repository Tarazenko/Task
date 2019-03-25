package by.bntu.fitr.poisit.tarazenko.model.logic;

public class ArrayWorker {

    public static int findLowerValueRowMinComp(double[][] array, double value) {
        return findMinPos(findCompInLowerValueColumns(array,value));
    }

    public static double[] findCompInLowerValueColumns(double[][] array, double value) {
        double[] columns = new double[array[0].length];
        for(int i = 0; i < array[0].length; i++)
            columns[i] = Double.POSITIVE_INFINITY;
        for (int j = 0; j < array.length; j++) {
            boolean flag = false;
            double comp = 1;
            for (int i = 0; i < array[j].length; i++) {
                comp *= array[i][j];
                if (array[i][j] > value) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                columns[j] = comp;
            }
        }
        return columns;
    }

    public static int findMinPos(double[] array) {
        int pos = 0;
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                pos = i;
            }
        }
        return pos;
    }
}
