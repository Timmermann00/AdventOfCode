import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
    public static class DataArrays
    {
        private int[] line1;
        private int[] line2;

        public DataArrays(int[] line1, int[] line2)
        {
            this.line1 = line1;
            this.line2 = line2;
        }

        public int[] getLine1() {return line1;}
        public int[] getLine2() {return line2;}
    }

    public static DataArrays readData() {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        try {
            File myObj = new File("./01/data.txt");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.split("\\s+");
                // Add validation to check for empty strings
                if (values.length >= 2 && !values[0].isEmpty() && !values[1].isEmpty()) {
                    list1.add(Integer.parseInt(values[0]));
                    list2.add(Integer.parseInt(values[1]));
                }
            }
            myReader.close();

            if (list1.isEmpty() || list2.isEmpty()) {
                return null;
            }

            int[] array1 = list1.stream().mapToInt(i -> i).toArray();
            int[] array2 = list2.stream().mapToInt(i -> i).toArray();

            return new DataArrays(array1, array2);
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
            return null;
        }
    }

}