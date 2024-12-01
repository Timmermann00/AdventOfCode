import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        DataReader.DataArrays data = DataReader.readData();

        if (data != null) {
            int[] line1 = data.getLine1();
            int[] line2 = data.getLine2();
            Arrays.sort(line1);
            Arrays.sort(line2);

            int result = compareLinesAndCalculateDifference.compareLinesAndCalculate(line1, line2);
            System.out.println("Result is:" + result);

        } else {
            System.out.println("Failed to read data from file.");
        }
    }
}
