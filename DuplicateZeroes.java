import java.util.Arrays;

public class DuplicateZeroes {
    public static void main(String[] args) {

        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i]==0) {
                    shiftOthers(arr, i);
                }
            }
        System.out.println(Arrays.toString(arr));
    }

    private static void shiftOthers(int[] arr, int index) {
        for (int i = index; i < arr.length-1; i++) {
            if (i < arr.length-2) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i+2] = temp;
            }
            else {
                arr[i+1] = arr[i];
            }
        }
    }

}

// Integer[] arr = new Integer[] {1, 0, 2, 3, 0, 4, 5, 0};
// ArrayList<Integer> arl = new ArrayList<>();

// for (int i = 0; i < arr.length; i++) {
// while (arl.size() != arr.length) {
// if (arr[i]==0) {
// arl.add(arr[i]);
// arl.add(arr[i]);
// } else {
// arl.add(arr[i]);
// }
// }
// }

// System.out.println(varType.getType(arl.toArray()));
// arr = (Integer[]) arl.toArray();
// System.out.println(arr.toString());

// Integer[] arr = new Integer[] {1, 0, 2, 3, 0, 4, 5, 0};
// List<Integer> l = Arrays.asList(arr);
// for (int i = 0; i < arr.length; i++) {
// if (arr[i]==0 && i != arr.length-1) {
// l.set(i+1, 7);
// }
// }

// for (Integer i : arr) {
// System.out.print(i + " ");
// }
