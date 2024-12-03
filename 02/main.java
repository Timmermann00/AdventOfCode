public class main {
    public static void main(String[] args) {
        int safeCount = DataReader.readDataAndCheckForSafety();
        System.out.println(safeCount);
    }
}
