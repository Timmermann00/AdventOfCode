public class compareLinesAndCalculate {
    public static int calculateDistance(int[] line1, int[] line2)
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

    public static int calculateSimilarityScore(int[] line1, int[] line2)
    {
        int similarityScore = 0;
        int[] smilarity = new int[line1.length];
        for(int x = 0; x < line1.length; x++)
        {
            int occurence = 0;
            for(int i = 0; i < line2.length; i++)
            {
                if(line1[x] == line2[i])
                {
                    occurence++;
                }
            }
            smilarity[x] = line1[x] * occurence;
        }
        for (int i : smilarity) {
            similarityScore = similarityScore + i;
        }
        return similarityScore;
    }
}
