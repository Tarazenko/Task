package by.bntu.fitr.poisit.tarazenko.model.data;

public class Matrix {

    private static final int DEFAULT_ROW = 5;
    private static final int DEFAULT_COLUMN = 5;
    private static final int NULL_LENGTH = 0;


    private double[][] matrix;

    public Matrix() {
        matrix = new double[DEFAULT_ROW][DEFAULT_COLUMN];
    }


    public Matrix(double[][] array) {
        this.matrix = array;

    }

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
    }

    public Matrix(int size) {
        this(size, size);
    }

    public int getCountRows() {
        if (matrix == null) {
            return NULL_LENGTH;
        } else {
            return matrix.length;
        }
    }

    public int getCountColumns() {
        if (matrix == null) {
            return NULL_LENGTH;
        } else {
            return matrix[0].length;
        }
    }

    public void setElement(int row, int column, double value) {
        matrix[row][column] = value;
    }

    public double getElement(int row, int column) {
        return matrix[row][column];
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                builder.append(matrix[i][j]).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
