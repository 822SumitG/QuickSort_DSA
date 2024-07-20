public class QuickSort {
    public static void QuickSort(int arr[], int low, int high) {
        if(low < high) {
            int pidx = partition(arr, low, high);
            QuickSort(arr, low, pidx-1);
            QuickSort(arr, pidx+1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                //Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //Swap with pivot
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 4, 2, 1};

        QuickSort(arr, 0, arr.length-1);

        //print
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
