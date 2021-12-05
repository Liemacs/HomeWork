package step.exe;

public class NumbersComparator {
    public int max(int arr[]) {
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) if (maxVal < arr[i]) maxVal = arr[i];
        return maxVal;
    }

    public int min(int arr[]) {
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) if (minVal > arr[i]) minVal = arr[i];
        return minVal;
    }
}
