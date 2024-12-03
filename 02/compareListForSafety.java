public class compareListForSafety {
    public static boolean checkIfDecreasing(int[] report) {
        for(int x = 0; x < report.length - 1; x++)
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
        for(int x = 0; x < report.length - 1; x++)
        {
            if(report[x] > report[x+1])
            {
                return false;
            }
        }
        return true;
    }
    public static boolean checkDifferenceBetweenLevels(int[] report) {
        for(int i = 0; i < report.length - 1; i++)
        {
            int result = report[i] - report[i + 1];
            if(result == 0 || result > 3)
            {
                return false;
            }
        }
        return true;
    }
}
