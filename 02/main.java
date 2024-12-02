public class main {
    public static void main(String[] args) {
        String[] data = DataReader.readDataAndCheckForSafety();

        if (data != null) {
            System.out.println("Data from this line is");

        } else {
            System.out.println("Failed to read data from file.");
        }
    }
}
