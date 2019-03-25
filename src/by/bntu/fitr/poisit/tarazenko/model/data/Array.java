package by.bntu.fitr.poisit.tarazenko.model.data;

public class Array {
    private static final int DEFAULT_SIZE = 5;
    private static final int NULL_LENGTH = 0;

    private double[] array;

    public Array() {
        array = new double[DEFAULT_SIZE];
    }


    public Array(double[] array){
        this.array = array;

    }

    public Array(int size){
        array = new double[size];
    }

    public int getSize() {
        if(array == null)
            return NULL_LENGTH;
        else
            return array.length;
    }

    public void setElement(int num, double value) {
        if(num < array.length)
            array[num] = value;
    }

    public double getElement(int num){
        return array[num];
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.getSize(); i++) {
            builder.append(array[i]).append(" ");
        }
        return builder.toString();
    }
}
