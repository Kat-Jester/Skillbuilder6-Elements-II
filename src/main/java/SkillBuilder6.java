public class SkillBuilder6 {

    /*
     * Task 1 - List Hopping (Jump Game)
     */
    public static boolean lastItemReachable(int[] hopList) {
        int maxReach = 0;

        for (int i = 0; i < hopList.length; i++) {
            // If our current position is beyond our ability to reach → failure
            if (i > maxReach) {
                return false;
            }

            // Update maximum reachable index
            maxReach = Math.max(maxReach, i + hopList[i]);

            // If we can reach or go past the last index → success
            if (maxReach >= hopList.length - 1) {
                return true;
            }
        }

        return false;
    }

    /*
     * Task 2 - Sliding Window Minimum
     */
    public static int[] slidingWindowMin(int[] numberList, int windowSize) {
        // Invalid window size → return empty array
        if (windowSize <= 0 || windowSize > numberList.length) {
            return new int[0];
        }

        int numWindows = numberList.length - windowSize + 1;
        int[] result = new int[numWindows];

        // Process each window
        for (int i = 0; i < numWindows; i++) {
            int min = numberList[i];

            // Check each element inside the current window
            for (int j = i; j < i + windowSize; j++) {
                if (numberList[j] < min) {
                    min = numberList[j];
                }
            }

            result[i] = min;
        }

        return result;
    }
}
