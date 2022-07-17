public class MountainArray {
    public static void main(String[] args) {
        int[] input = new int [] {1, 1, 4, 3, 5, 7, 9, 6, 2, 3, 1, 9};
              
        int max = input[0];
        int maxPos = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
                maxPos = i;
            }
        }

        System.out.printf("%d at pos %d\n", max, maxPos);

        if (maxPos == 0) {
            System.out.println("false and finish - позиция max");
        }

        for (int i = 0; i < maxPos; i++) {
            if (input[i+1] == input[i] || input[i+1] < input[i]) {
                System.out.println("false and finish - не возрастает");
            }
        }

        for (int i = maxPos; i < input.length-1; i++) {
            if (input[i+1] == input[i] || input[i+1] > input[i]) {
                System.out.println("false and finish - не падает");
        }
        }
    }
}

    // public static boolean isIt(int[] input) {
    //     int i = 0;
    //     while (input[i+1] > input[i]) {
    //         if (i == input.length-2 || input[i] == input[i+1]) {
    //             return false;
    //         }
    //         if (input[i+1] < input[i]) {
    //             break;
    //         }
    //         i++;
    //     }
    //     while (input[i+1] < input[i] && i < input.length-2) {
    //         if (i == 0 || input[i+1] == input[i]) {
    //             return false;
    //         }
    //         i++;
    //     }   
    // return true;
    // }

    //-------------------------------//
//   public static boolean isIt(int[] input) {
//         int i = 0;
//         for (i < input.length-1; i++) {
//             if (input[i] == input[i+1]) {
//                 return false;
//             }
//             if (input[i+1] < input[i] && i == 0) {
//                 return false;
//             }
//             else {
//                 break;
//                 for (int j = i; j < input.length; j++) {
                    
//                 }
//             }
//         }
        
//         return false;
//     }
        
    //     return false;


