package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Matrix {

    public static void multiply(ArrayList<ArrayList<Double>> matrix, int rows, int cols, int n) {
        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Double> row = matrix.get(i);
            for (int j = 0; j < matrix.get(0).size(); j++) {
                    double newValue = row.get(j) * n;
                    row.set(j, newValue);
            }
        }
    }
    public static void main(String[] args) {

        int rows = 5;
        int columns = 2;
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        ArrayList<Double> row0 = new ArrayList<Double>(Arrays.asList(1.0, 3.0));
        //row0.add(1.0);
        //row0.add(3.0);
        matrix.add(row0);
        ArrayList<Double> row1 = new ArrayList<Double>(Arrays.asList(4.0, 5.0));
        //row1.add(4.0);
        //row1.add(5.0);
        matrix.add(row1);
        Matrix.multiply(matrix, 2, 2, 10);
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(0).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }


    }
}
