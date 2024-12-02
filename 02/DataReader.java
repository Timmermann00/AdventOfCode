import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReader {

    public static String[] readDataAndCheckForSafety() {
        try {
            File myObj = new File("data.txt");
            Scanner myReader = new Scanner(myObj);
            int counter = 0;
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.split("\\s+");
                int[] report = new int[values.length];
                for(int i= 0; i< report.length; i++)
                {
                    report[i] = Integer.parseInt(values[i]);
                }
                if(compareListForSafety.checkIfDecreasing(report) || compareListForSafety.checkIfIncreasing(report))
                {

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
            return null;
        }
    }

}