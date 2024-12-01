public class compareLinesAndCalculateDifference {
    public static int compareLinesAndCalculate(int[] line1, int[] line2)
    {
        int[] difference = new int[line1.length];
        int distance = 0;
        for(int x = 0; x < line1.length; x++)
        {
            if(line1[x] > line2[x])
            {
                int value = line1[x] - line2[x];
                difference[x] = value;
            }
            else
            {
                int value = line2[x] - line1[x];
                difference[x] = value;
            }
        }
        for (int i : difference) {
            distance = distance + i;
        }
        return distance;
    }
}
