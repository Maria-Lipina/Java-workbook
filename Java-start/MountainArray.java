public class MountainArray {

    public static boolean isIt(int[] input) {

        int max = input[0];
        int maxPos = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
                maxPos = i;
            }
        }

        if (maxPos == 0 | maxPos == input.length-1) {
            return false;
        }
        for (int i = 0; i < maxPos; i++) {
            if (input[i + 1] == input[i] || input[i + 1] < input[i]) {
                return false;
            }
        }
        for (int i = maxPos; i < input.length - 1; i++) {
            if (input[i + 1] == input[i] || input[i + 1] > input[i]) {
                return false;
            }
        }
        return true;
    }
}