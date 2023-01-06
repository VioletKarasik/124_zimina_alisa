public class Dubler {
    public int[] doubling(int[] arr) {
        int[] new_arr = new int[arr.length * 2];
        int j = 0;
        for (int i=0; i< arr.length; i++) {
            new_arr[j] = arr[i];
            new_arr[j + 1] = arr[i];
            j += 2;
        }
        return  new_arr;
    }
}