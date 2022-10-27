public class ArrFunctions {
    public int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public int avg(int[] arr) {
        return sum(arr) / arr.length;
    }
}
