public class compareListForSafety {
    public static boolean checkIfDecreasing(int[] report) {
        for(int x = 0; x < report.length; x++)
        {
            //check if decreasing
            if(report[x] < report[x+1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean checkIfIncreasing(int[] report) {
        for(int x = 0; x < report.length; x++)
        {
            //check if decreasing
            if(report[x] > report[x+1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean checkDifferenceBetweenLevels(int[] report) {
        return true;
    }
}
